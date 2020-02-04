package com.iot.hardware.callback;

import com.iot.hardware.model.vo.GateCallbackVO;

/**
 * callback接口
 */
public interface ICallBack {

    /**
     * do callback
     */
    void callBack(GateCallbackVO vo);
}
