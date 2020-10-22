package com.hero.cn.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author sucx
 * @projectName colud-parent
 * @description:
 * @date 2020/10/2116:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 流水号
     */
    private String serial;
}
