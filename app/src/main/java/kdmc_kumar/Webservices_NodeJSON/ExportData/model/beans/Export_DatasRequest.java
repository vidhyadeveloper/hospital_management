/*
  File generated by Magnet rest2mobile 1.1 - Nov 24, 2017 11:07:28 AM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.ExportData.model.beans;


/**
 * Generated from json example
 {
 "MethodName" : "insertDiagnosisClient",
 "JsonValue" : "[{\"diagnosisdata\":\"Newss\",\"Id\":\"4\"}]"
 }

 */

public class Export_DatasRequest {


    @com.google.gson.annotations.SerializedName("JsonValue")
    private String jsonValue = null;


    @com.google.gson.annotations.SerializedName("MethodName")
    private String methodName = null;

    public Export_DatasRequest() {
    }

    public final String getJsonValue() {
        return jsonValue;
    }

    public final void setJsonValue(String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public final String getMethodName() {
        return methodName;
    }

    public final void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * Builder for Export_DatasRequest
     **/
    public static class Export_DatasRequestBuilder {
        private final Export_DatasRequest toBuild = new Export_DatasRequest();

        public Export_DatasRequestBuilder() {
        }

        public final Export_DatasRequest build() {
            return toBuild;
        }

        public final Export_DatasRequestBuilder jsonValue(String value) {
            toBuild.setJsonValue(value);
            return this;
        }

        public final Export_DatasRequestBuilder methodName(String value) {
            toBuild.setMethodName(value);
            return this;
        }
    }
}
