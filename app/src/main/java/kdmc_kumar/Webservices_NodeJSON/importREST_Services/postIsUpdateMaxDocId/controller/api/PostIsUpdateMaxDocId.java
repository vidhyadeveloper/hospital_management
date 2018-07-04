/*
  File generated by Magnet rest2mobile 1.1 - Nov 13, 2017 1:21:26 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.importREST_Services.postIsUpdateMaxDocId.controller.api;

import com.magnet.android.mms.async.Call;
import com.magnet.android.mms.async.StateChangedListener;

import kdmc_kumar.Webservices_NodeJSON.importREST_Services.postIsUpdateMaxDocId.model.beans.IsUpdateMaxDocIdResult;
import kdmc_kumar.Webservices_NodeJSON.importREST_Services.postIsUpdateMaxDocId.model.beans.PostIsUpdateMaxDocIdRequest;

public interface PostIsUpdateMaxDocId {

    /**
     * Generated from URL POST http://192.168.137.143:1234/importMasters/postDocIdIsUpdateMax
     * POST importMasters/postDocIdIsUpdateMax
     * @param body  style:PLAIN
     * @param listener
     * @return IsUpdateMaxDocIdResult
     */
    Call<IsUpdateMaxDocIdResult> postIsUpdateMaxDocId(
            PostIsUpdateMaxDocIdRequest body,
            StateChangedListener listener
    );


}
