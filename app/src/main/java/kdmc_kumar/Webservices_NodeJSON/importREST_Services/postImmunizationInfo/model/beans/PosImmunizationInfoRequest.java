/*
  File generated by Magnet rest2mobile 1.1 - Nov 13, 2017 6:36:07 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.importREST_Services.postImmunizationInfo.model.beans;


/**
 * Generated from json example
 {
 "PatId" : "",
 "DocId" : ""
 }

 */

public class PosImmunizationInfoRequest {


    @com.google.gson.annotations.SerializedName("DocId")
    private String docId = null;


    @com.google.gson.annotations.SerializedName("PatId")
    private String patId = null;

    public PosImmunizationInfoRequest() {
    }

    public final String getDocId() {
        return docId;
    }

    public final void setDocId(String docId) {
        this.docId = docId;
    }

    public final String getPatId() {
        return patId;
    }

    public final void setPatId(String patId) {
        this.patId = patId;
    }

    /**
     * Builder for PosImmunizationInfoRequest
     **/
    public static class PosImmunizationInfoRequestBuilder {
        private final PosImmunizationInfoRequest toBuild = new PosImmunizationInfoRequest();

        public PosImmunizationInfoRequestBuilder() {
        }

        public final PosImmunizationInfoRequest build() {
            return toBuild;
        }

        public final PosImmunizationInfoRequestBuilder docId(String value) {
            toBuild.setDocId(value);
            return this;
        }

        public final PosImmunizationInfoRequestBuilder patId(String value) {
            toBuild.setPatId(value);
            return this;
        }
    }
}