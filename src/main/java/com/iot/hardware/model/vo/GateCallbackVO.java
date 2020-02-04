package com.iot.hardware.model.vo;

import lombok.Data;
import lombok.Builder;

/**
 * 回调值对象
 */
@Data
@Builder
public class GateCallbackVO {
    /**
     * 设备ip
     */
    private String IP;
    /**
     * 设备编号
     */
    private String deviceKey;
    /**
     * 设备编号(冗余)
     */
    private String sn;
    /**
     * 对应人员id
     */
    private String personId;
    /**
     * 设备时间
     */
    private long time;
    /**
     * 回调数据类型(厂商)
     */
    private String type;
}
