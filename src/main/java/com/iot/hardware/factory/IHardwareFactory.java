package com.iot.hardware.factory;

/**
 * 硬件工厂 获取对应的硬件
 * @param <T>
 *     硬件接口
 * @param <E>
 *     硬件接口构建依赖参数
 * @param <C>
 *     回调接口
 */
public interface IHardwareFactory<T,E,C> {
    /**
     * 获取硬件资源
     * @param e 硬件接口构建依赖参数
     * @return
     */
    T getHardware(E e, C callBack);
}
