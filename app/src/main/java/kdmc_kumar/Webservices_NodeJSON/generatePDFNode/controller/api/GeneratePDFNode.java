/*
  File generated by Magnet rest2mobile 1.1 - 9 Mar, 2018 12:44:20 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.generatePDFNode.controller.api;

import com.magnet.android.mms.async.Call;
import com.magnet.android.mms.async.StateChangedListener;

import kdmc_kumar.Webservices_NodeJSON.generatePDFNode.model.beans.GetPDFNodeJsRequest;
import kdmc_kumar.Webservices_NodeJSON.generatePDFNode.model.beans.PDFNodeJsResult;


public interface GeneratePDFNode {

    /**
     * Generated from URL POST http://192.168.137.143:1234/ExportMasters/kdmcPDF
     * POST ExportMasters/kdmcPDF
     * @param contentType (original name : Content-Type) style:HEADER
     * @param body  style:PLAIN
     * @param listener
     * @return PDFNodeJsResult
     */
    Call<PDFNodeJsResult> getPDFNodeJs(
            String contentType,
            GetPDFNodeJsRequest body,
            StateChangedListener listener
    );


}
