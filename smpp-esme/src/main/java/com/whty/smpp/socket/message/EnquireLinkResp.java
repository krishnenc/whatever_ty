package com.whty.smpp.socket.message;

import com.whty.smpp.socket.constants.SmppConstants;


/**
 * 
 * @ClassName EnquireLinkResp
 * @author Administrator
 * @date 2017-3-10 下午1:46:30
 * @Description TODO(这里用一句话描述这个类的作用)
 */
public class EnquireLinkResp extends EmptyBodyResp {

    public EnquireLinkResp() {
        super(SmppConstants.CMD_ID_ENQUIRE_LINK_RESP, "enquire_link_resp");
    }
    
}