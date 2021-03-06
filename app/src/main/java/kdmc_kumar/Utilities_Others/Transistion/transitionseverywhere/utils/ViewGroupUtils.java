/*
 * Copyright (C) 2014 Andrey Kulikov (andkulikov@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kdmc_kumar.Utilities_Others.Transistion.transitionseverywhere.utils;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Build.VERSION_CODES;
import android.view.ViewGroup;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import displ.mobydocmarathi.com.R;

@TargetApi(VERSION_CODES.ICE_CREAM_SANDWICH)
public class ViewGroupUtils {

    @TargetApi(VERSION_CODES.JELLY_BEAN)
    static class BaseViewGroupUtils {

        private static final int LAYOUT_TRANSITION_CHANGING = 4;

        private static Field sFieldLayoutSuppressed;
        private static LayoutTransition sEmptyLayoutTransition;
        private static Method sMethodLayoutTransitionCancel;

        public void suppressLayout(final ViewGroup group, boolean suppress) {
            if (sEmptyLayoutTransition == null) {
                sEmptyLayoutTransition = new LayoutTransition() {
                    @Override
                    public boolean isChangingLayout() {
                        return true;
                    }
                };
                sEmptyLayoutTransition.setAnimator(LayoutTransition.APPEARING, null);
                sEmptyLayoutTransition.setAnimator(LayoutTransition.CHANGE_APPEARING, null);
                sEmptyLayoutTransition.setAnimator(LayoutTransition.CHANGE_DISAPPEARING, null);
                sEmptyLayoutTransition.setAnimator(LayoutTransition.DISAPPEARING, null);
                sEmptyLayoutTransition.setAnimator(LAYOUT_TRANSITION_CHANGING, null);
            }
            if (suppress) {
                cancelLayoutTransition(group);
                LayoutTransition layoutTransition = group.getLayoutTransition();
                if (layoutTransition != null && layoutTransition != sEmptyLayoutTransition) {
                    group.setTag(R.id.group_layouttransition_backup, group.getLayoutTransition());
                }
                group.setLayoutTransition(sEmptyLayoutTransition);
            } else {
                group.setLayoutTransition(null);
                if (sFieldLayoutSuppressed == null) {
                    sFieldLayoutSuppressed = ReflectionUtils.getPrivateField(ViewGroup.class,
                            "mLayoutSuppressed");
                }
                Boolean suppressed = (Boolean) ReflectionUtils.getFieldValue(group,
                        Boolean.FALSE, sFieldLayoutSuppressed);
                if (!Boolean.FALSE.equals(suppressed)) {
                    ReflectionUtils.setFieldValue(group, sFieldLayoutSuppressed, false);
                    group.requestLayout();
                }
                final LayoutTransition layoutTransition = (LayoutTransition)
                        group.getTag(R.id.group_layouttransition_backup);
                if (layoutTransition != null) {
                    group.setTag(R.id.group_layouttransition_backup, null);
                    group.setLayoutTransition(layoutTransition);
                }
            }
        }

        public boolean cancelLayoutTransition(ViewGroup group) {
            if (group != null) {
                final LayoutTransition layoutTransition = group.getLayoutTransition();
                if (layoutTransition != null && layoutTransition.isRunning()) {
                    if (sMethodLayoutTransitionCancel == null) {
                        sMethodLayoutTransitionCancel = ReflectionUtils.getPrivateMethod(LayoutTransition.class, "cancel");
                    }
                    ReflectionUtils.invoke(group.getLayoutTransition(), null, sMethodLayoutTransitionCancel);
                    return true;
                }
            }
            return false;
        }
    }

    @TargetApi(VERSION_CODES.JELLY_BEAN_MR2)
    static class JellyBeanMr2ViewGroupUtils extends BaseViewGroupUtils {

        private static Method sMethodSuppressLayout;

        @Override
        public void suppressLayout(ViewGroup group, boolean suppress) {
            if (sMethodSuppressLayout == null) {
                sMethodSuppressLayout = ReflectionUtils.getMethod(ViewGroup.class, "suppressLayout", boolean.class);
            }
            ReflectionUtils.invoke(group, null, sMethodSuppressLayout, suppress);
        }
    }

    private static final BaseViewGroupUtils IMPL;

    static {
        if (Build.VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN_MR2) {
            IMPL = new JellyBeanMr2ViewGroupUtils();
        } else {
            IMPL = new BaseViewGroupUtils();
        }
    }

    public static void suppressLayout(ViewGroup group, boolean suppress) {
        if (group != null) {
            IMPL.suppressLayout(group, suppress);
        }
    }

    /**
     * @return is cancel performed
     */
    public static boolean cancelLayoutTransition(ViewGroup group) {
        return IMPL.cancelLayoutTransition(group);
    }
}
