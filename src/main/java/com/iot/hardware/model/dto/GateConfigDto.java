package com.iot.hardware.model.dto;

import lombok.Data;
import lombok.Builder;

/**
 * 闸机配置传输对象(构建依赖参数)
 */
@Data
@Builder
public class GateConfigDto {
    /**
     * 厂商
     */
    private String manufacturer;
}
