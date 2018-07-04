/*
  File generated by Magnet rest2mobile 1.1 - Nov 14, 2017 10:42:38 AM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.importREST_Services.posPatId.controller.api;

import com.magnet.android.mms.MagnetMobileClient;
import com.magnet.android.mms.controller.AbstractControllerSchemaFactory;
import com.magnet.android.mms.controller.ControllerFactory;
import com.magnet.android.mms.controller.RequestSchema;
import com.magnet.android.mms.controller.RequestSchema.JMethod;

import java.util.Collections;

import kdmc_kumar.Core_Modules.BaseConfig;
import kdmc_kumar.Webservices_NodeJSON.importREST_Services.posPatId.model.beans.PosPatIdRequest;
import kdmc_kumar.Webservices_NodeJSON.importREST_Services.posPatId.model.beans.PosPatIdResult;

public class PostPatIdFactory extends ControllerFactory<PostPatId> {
    public PostPatIdFactory(MagnetMobileClient magnetClient) {
        super(PostPatId.class, PostPatIdSchemaFactory.getInstance().getSchema(), magnetClient);
    }

    // Schema factory for controller PostPatId
    public static class PostPatIdSchemaFactory extends AbstractControllerSchemaFactory {
        private static PostPatIdSchemaFactory __instance = null;

        private PostPatIdSchemaFactory() {
        }

        static PostPatIdSchemaFactory getInstance() {
            synchronized (PostPatIdSchemaFactory.class) {
                if (null == __instance) {
                    __instance = new PostPatIdSchemaFactory();
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

                //controller schema for controller method posPatId
                JMethod method1 = addMethod("posPatId",
                        "importMastersSP/GetPatientOperationInfo",
                        "POST",
                        PosPatIdResult.class,
                        null,
                        Collections.singletonList("application/json"),
                        Collections.singletonList("application/json"));
                method1.setBaseUrl(BaseConfig.AppNodeIP);
                method1.addParam("body",
                        "PLAIN",
                        PosPatIdRequest.class,
                        null,
                        "",
                        true);
            }
        }

    }

}
