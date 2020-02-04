package com.iot.hardware.factory;

import com.iot.hardware.factory.impl.GateFactory;

/**
 * 工厂build
 */
public class HardwareFactoryBuild {
    public static final String FACTORY_GATE = "gate";

    public static final String MANUFACTURER_HK = "hk";

    public static IHardwareFactory getHardwareFacoty(String operation){
        IHardwareFactory factory = null;
        if(FACTORY_GATE.equals(operation)){
            factory = new GateFactory();
        }

        return factory;
    }
}
