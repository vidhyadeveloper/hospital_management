/*
  File generated by Magnet rest2mobile 1.1 - 8 Feb, 2018 11:48:07 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.importREST_Services.updateDB.model.beans;


/**
 * Generated from json example
 {
 "Results" : ""
 }

 */

public class DBUpdateResult {


    @com.google.gson.annotations.SerializedName("Results")
    private String results = null;

    public DBUpdateResult() {
    }

    public final String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    /**
     * Builder for DBUpdateResult
     **/
    public static class DBUpdateResultBuilder {
        private final DBUpdateResult toBuild = new DBUpdateResult();

        public DBUpdateResultBuilder() {
        }

        public final DBUpdateResult build() {
            return toBuild;
        }

        public final DBUpdateResultBuilder results(String value) {
            toBuild.setResults(value);
            return this;
        }
    }
}
