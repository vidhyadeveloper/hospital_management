/*
  File generated by Magnet rest2mobile 1.1 - Nov 11, 2017 5:03:19 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.importREST_Services.getPatientMapping.model.beans;


/**
 * Generated from json example
 {
 "Results" : ""
 }

 */

public class PatientMappingResult {


    @com.google.gson.annotations.SerializedName("Results")
    private String results = null;

    public PatientMappingResult() {
    }

    public final String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    /**
     * Builder for PatientMappingResult
     **/
    public static class PatientMappingResultBuilder {
        private final PatientMappingResult toBuild = new PatientMappingResult();

        public PatientMappingResultBuilder() {
        }

        public final PatientMappingResult build() {
            return toBuild;
        }

        public final PatientMappingResultBuilder results(String value) {
            toBuild.setResults(value);
            return this;
        }
    }
}
