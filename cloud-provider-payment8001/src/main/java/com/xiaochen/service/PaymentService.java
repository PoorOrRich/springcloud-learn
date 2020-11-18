package com.xiaochen.service;

import com.xiaochen.entities.Payment;

public interface PaymentService {

    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}
