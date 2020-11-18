package com.xiaochen.service.impl;

import com.xiaochen.dao.PaymentDao;
import com.xiaochen.entities.Payment;
import com.xiaochen.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return paymentDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Payment record) {
        return paymentDao.insert(record);
    }

    @Override
    public int insertSelective(Payment record) {
        return paymentDao.insertSelective(record);
    }

    @Override
    public Payment selectByPrimaryKey(Long id) {
        return paymentDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Payment record) {
        return paymentDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Payment record) {
        return paymentDao.updateByPrimaryKey(record);
    }
}
