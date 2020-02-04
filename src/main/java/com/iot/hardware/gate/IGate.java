package com.iot.hardware.gate;

/**
 * 闸机接口
 * 由具体的厂商根据需要实现
 */
public interface IGate {

    /**
     * 登录-需检查设备编号是否匹配并布防
     * 入口：
     *  程序启动
     *  新增设备
     * @return
     */
    boolean loginAndSetAlarm(String deviceIp, int port, String account, String password, String deviceSN);
    /**
     * 下发劳务工信息(卡片)到闸机
     * 入口：
     *  新增设备
     *  新增人员
     *  人员进退场
     * @return
     */
    boolean sendStaffCardInfo(String deviceIp, int port, String account, String password, String deviceSN);
}
