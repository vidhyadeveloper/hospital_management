/*
  File generated by Magnet rest2mobile 1.1 - Nov 24, 2017 11:07:28 AM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.ExportData.model.beans;


/**
 * Generated from json example
 {
 "Results" : "[{\"Id\":50}]"
 }

 */


public class Export_DatasResult {


    @com.google.gson.annotations.SerializedName("LocalIds")
    private String localIds = null;


    @com.google.gson.annotations.SerializedName("Results")
    private String results = null;

    public Export_DatasResult() {
    }

    public final String getLocalIds() {
        return localIds;
    }

    public final String getResults() {
        return results;
    }

    public void setLocalIds(String localIds) {
        this.localIds = localIds;
    }

    public void setResults(String results) {
        this.results = results;
    }

    /**
     * Builder for Export_DatasResult
     **/
    public static class Export_DatasResultBuilder {
        private final Export_DatasResult toBuild = new Export_DatasResult();

        public Export_DatasResultBuilder() {
        }

        public final Export_DatasResult build() {
            return toBuild;
        }

        public final Export_DatasResultBuilder localIds(String value) {
            toBuild.setLocalIds(value);
            return this;
        }

        public final Export_DatasResultBuilder results(String value) {
            toBuild.setResults(value);
            return this;
        }
    }
}
