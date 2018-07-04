/*
  File generated by Magnet rest2mobile 1.1 - Nov 13, 2017 6:36:07 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.importREST_Services.postImmunizationInfo.controller.api;

import com.magnet.android.mms.MagnetMobileClient;
import com.magnet.android.mms.controller.AbstractControllerSchemaFactory;
import com.magnet.android.mms.controller.ControllerFactory;
import com.magnet.android.mms.controller.RequestSchema;
import com.magnet.android.mms.controller.RequestSchema.JMethod;

import java.util.Collections;

import kdmc_kumar.Core_Modules.BaseConfig;
import kdmc_kumar.Webservices_NodeJSON.importREST_Services.postImmunizationInfo.model.beans.PosImmunizationInfoRequest;
import kdmc_kumar.Webservices_NodeJSON.importREST_Services.postImmunizationInfo.model.beans.PosImmunizationInfoResult;

public class PostImmunizationInfoFactory extends ControllerFactory<PostImmunizationInfo> {
    public PostImmunizationInfoFactory(MagnetMobileClient magnetClient) {
        super(PostImmunizationInfo.class, PostImmunizationInfoSchemaFactory.getInstance().getSchema(), magnetClient);
    }

    // Schema factory for controller PostImmunizationInfo
    public static class PostImmunizationInfoSchemaFactory extends AbstractControllerSchemaFactory {
        private static PostImmunizationInfoSchemaFactory __instance = null;

        private PostImmunizationInfoSchemaFactory() {
        }

        static PostImmunizationInfoSchemaFactory getInstance() {
            synchronized (PostImmunizationInfoSchemaFactory.class) {
                if (null == __instance) {
                    __instance = new PostImmunizationInfoSchemaFactory();
                }

                return __instance;
            }
        }

        protected final void initSchemaMaps() {
            synchronized (this) {
                if (null != schema) {
                    return;
                }

                schema = new RequestSchema();
                schema.setRootPath("");

                //controller schema for controller method posImmunizationInfo
                JMethod method1 = addMethod("posImmunizationInfo",
                        "importMastersSP/Sel_Vaccinationtemp_webupdate",
                        "POST",
                        PosImmunizationInfoResult.class,
                        null,
                        Collections.singletonList("application/json"),
                        Collections.singletonList("application/json"));
                method1.setBaseUrl(BaseConfig.AppNodeIP);
                method1.addParam("body",
                        "PLAIN",
                        PosImmunizationInfoRequest.class,
                        null,
                        "",
                        true);
            }
        }

    }

}