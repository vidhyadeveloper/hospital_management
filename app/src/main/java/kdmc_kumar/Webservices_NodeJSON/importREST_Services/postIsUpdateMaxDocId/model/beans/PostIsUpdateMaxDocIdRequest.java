/*
  File generated by Magnet rest2mobile 1.1 - Nov 13, 2017 1:21:26 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.importREST_Services.postIsUpdateMaxDocId.model.beans;


/**
 * Generated from json example
 {
 "IsUpdateMax" : "0",
 "DocId" : "3"
 }

 */

public class PostIsUpdateMaxDocIdRequest {


    @com.google.gson.annotations.SerializedName("DocId")
    private String docId = null;


    @com.google.gson.annotations.SerializedName("IsUpdateMax")
    private String isUpdateMax = null;

    public PostIsUpdateMaxDocIdRequest() {
    }

    public final String getDocId() {
        return docId;
    }

    public final void setDocId(String docId) {
        this.docId = docId;
    }

    public final String getIsUpdateMax() {
        return isUpdateMax;
    }

    public final void setIsUpdateMax(String isUpdateMax) {
        this.isUpdateMax = isUpdateMax;
    }

    /**
     * Builder for PostIsUpdateMaxDocIdRequest
     **/
    public static class PostIsUpdateMaxDocIdRequestBuilder {
        private final PostIsUpdateMaxDocIdRequest toBuild = new PostIsUpdateMaxDocIdRequest();

        public PostIsUpdateMaxDocIdRequestBuilder() {
        }

        public final PostIsUpdateMaxDocIdRequest build() {
            return toBuild;
        }

        public final PostIsUpdateMaxDocIdRequestBuilder docId(String value) {
            toBuild.setDocId(value);
            return this;
        }

        public final PostIsUpdateMaxDocIdRequestBuilder isUpdateMax(String value) {
            toBuild.setIsUpdateMax(value);
            return this;
        }
    }
}
