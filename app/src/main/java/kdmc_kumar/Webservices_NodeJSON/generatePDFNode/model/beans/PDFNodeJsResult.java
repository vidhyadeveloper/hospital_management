/*
  File generated by Magnet rest2mobile 1.1 - 9 Mar, 2018 12:44:19 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.generatePDFNode.model.beans;


/**
 * Generated from json example
 {
 "Result" : "PDF",
 "URL" : "PDFURL"
 }

 */

public class PDFNodeJsResult {


    @com.google.gson.annotations.SerializedName("Result")
    private String result = null;


    @com.google.gson.annotations.SerializedName("URL")
    private String uRL = null;

    public PDFNodeJsResult() {
    }

    public final String getResult() {
        return result;
    }

    public final String getURL() {
        return getuRL();
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getuRL() {
        return uRL;
    }

    public void setuRL(String uRL) {
        this.uRL = uRL;
    }


    /**
     * Builder for PDFNodeJsResult
     **/
    public static class PDFNodeJsResultBuilder {
        private final PDFNodeJsResult toBuild = new PDFNodeJsResult();

        public PDFNodeJsResultBuilder() {
        }

        public final PDFNodeJsResult build() {
            return toBuild;
        }

        public final PDFNodeJsResultBuilder result(String value) {
            toBuild.setResult(value);
            return this;
        }

        public final PDFNodeJsResultBuilder uRL(String value) {
            toBuild.setuRL(value);
            return this;
        }
    }
}
