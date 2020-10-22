package com.hero.cn.mappers;

import com.hero.cn.models.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author sucx
 * @projectName colud-parent
 * @description:
 * @date 2020/10/2116:48
 */
@Mapper
public interface PaymentMapper {

    /**
     * 新增
     * @param payment
     * @return
     */
    int insert(Payment payment);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Payment selectById(Long id);
}
