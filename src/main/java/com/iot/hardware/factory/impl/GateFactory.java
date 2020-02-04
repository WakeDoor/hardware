package com.iot.hardware.factory.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.iot.hardware.factory.HardwareFactoryBuild;
import lombok.extern.slf4j.Slf4j;

import com.hardware.hk.HKFaceGate;
import com.iot.hardware.gate.IGate;
import com.iot.hardware.callback.ICallBack;
import com.iot.hardware.model.dto.GateConfigDto;
import com.iot.hardware.factory.IHardwareFactory;


/**
 * 闸机工厂
 * 该工厂提供闸机相关能力
 */
@Slf4j
public class GateFactory implements IHardwareFactory<IGate, GateConfigDto, ICallBack> {
    @Override
    public IGate getHardware(GateConfigDto dto, ICallBack callBack) {
        IGate gate = null;
        if (HardwareFactoryBuild.MANUFACTURER_HK.equals(dto.getManufacturer())) {
            gate = new HKFaceGate();
            setCallBack(gate, callBack);
        }

        return gate;
    }

    /**
     * 设置callback
     *
     * @param gate
     * @param callBack
     */
    private void setCallBack(IGate gate, ICallBack callBack) {
        //利用反射获取类属性
        Field[] field = gate.getClass().getDeclaredFields();
        for (int i = 0; i < field.length; i++) {
            field[i].setAccessible(true);
            //得到属性名
            String name = field[i].getName();
            //获取属性类型
            String type = field[i].getGenericType().toString();
            Method method;
            String methodName = name.substring(0, 1).toUpperCase() + name.substring(1);
            try {
                if (type.equals("interface com.iot.hardware.callback.ICallBack")) {
                    method = gate.getClass().getMethod("set" + methodName, ICallBack.class);
                    method.invoke(gate, callBack);
                }
            } catch (Exception ex) {
                log.error(ex.getMessage());
            }
        }
    }
}
