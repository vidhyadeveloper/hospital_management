/*
  File generated by Magnet rest2mobile 1.1 - 8 Feb, 2018 1:39:17 AM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.importREST_Services.getDoctorDetails.model.beans;


/**
 * Generated from json example
 {
 "Results" : ""
 }

 */

public class DoctorIdResult {


    @com.google.gson.annotations.SerializedName("Results")
    private String results = null;

    public DoctorIdResult() {
    }

    public final String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    /**
     * Builder for DoctorIdResult
     **/
    public static class DoctorIdResultBuilder {
        private final DoctorIdResult toBuild = new DoctorIdResult();

        public DoctorIdResultBuilder() {
        }

        public final DoctorIdResult build() {
            return toBuild;
        }

        public final DoctorIdResultBuilder results(String value) {
            toBuild.setResults(value);
            return this;
        }
    }
}
