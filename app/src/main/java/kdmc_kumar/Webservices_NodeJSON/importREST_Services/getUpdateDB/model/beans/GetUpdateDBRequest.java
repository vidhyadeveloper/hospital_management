/*
  File generated by Magnet rest2mobile 1.1 - Jan 24, 2018 12:21:20 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.importREST_Services.getUpdateDB.model.beans;


/**
 * Generated from json example
 {
 "Docid" : "DOCID/2017/05/81",
 "imei" : "",
 "mac" : "0"
 }

 */

public class GetUpdateDBRequest {


    @com.google.gson.annotations.SerializedName("Docid")
    private String docid = null;


    private String imei = null;


    private String mac = null;

    public GetUpdateDBRequest() {
    }

    public final String getDocid() {
        return docid;
    }

    public final void setDocid(String docid) {
        this.docid = docid;
    }

    public final String getImei() {
        return imei;
    }

    public final void setImei(String imei) {
        this.imei = imei;
    }

    public final String getMac() {
        return mac;
    }

    public final void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * Builder for GetUpdateDBRequest
     **/
    public static class GetUpdateDBRequestBuilder {
        private final GetUpdateDBRequest toBuild = new GetUpdateDBRequest();

        public GetUpdateDBRequestBuilder() {
        }

        public final GetUpdateDBRequest build() {
            return toBuild;
        }

        public final GetUpdateDBRequestBuilder docid(String value) {
            toBuild.setDocid(value);
            return this;
        }

        public final GetUpdateDBRequestBuilder imei(String value) {
            toBuild.setImei(value);
            return this;
        }

        public final GetUpdateDBRequestBuilder mac(String value) {
            toBuild.setMac(value);
            return this;
        }
    }
}
