package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    /**
     * 查
     * @param id 查询条件
     * @return 对象 {Payment}
     */
    Payment getPaymentById(@Param("id") Long id);

    /**
     * 新增
     *
     * @param payment 对象
     * @return 操作条数 {int}
     */
    int create(Payment payment);
}
