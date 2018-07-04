/*
  File generated by Magnet rest2mobile 1.1 - 27 Mar, 2018 5:10:19 PM
  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.exportCaseNotes.controller.api;

import com.magnet.android.mms.async.Call;
import com.magnet.android.mms.async.StateChangedListener;

import kdmc_kumar.Webservices_NodeJSON.exportCaseNotes.model.beans.ExportCaseNotesRequest;
import kdmc_kumar.Webservices_NodeJSON.exportCaseNotes.model.beans.ExportCaseNotesResult;


public interface ExportCaseNotes {

  /**
   * Generated from URL POST http://192.168.137.123:1234/exportMasters/postData
   * POST exportMasters/postData
   * @param contentType (original name : Content-Type) style:HEADER
   * @param body  style:PLAIN
   * @param listener
   * @return ExportCaseNotesResult
   */
  Call<ExportCaseNotesResult> exportCaseNotes(
          String contentType,
          ExportCaseNotesRequest body,
          StateChangedListener listener
  );


}