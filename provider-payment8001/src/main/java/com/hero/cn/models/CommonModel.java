package com.hero.cn.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author sucx
 * @projectName colud-parent
 * @description:
 * @date 2020/10/2116:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonModel<T> implements Serializable {
    /**
     * 代码
     */
    private Integer code;
    /**
     * 消息
     */
    private String message;
    /**
     * 数据
     */
    private T data;
}
