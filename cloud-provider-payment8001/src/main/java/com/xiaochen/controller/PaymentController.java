package com.xiaochen.controller;

import com.xiaochen.entities.CommonResult;
import com.xiaochen.entities.Payment;
import com.xiaochen.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        if (payment != null){
            int result = paymentService.insert(payment);
            log.info("*****数据插入结果："+ result +"*****");
            if (result >0 ){
                return new CommonResult(200,"数据插入成功!",result);
            }else {
                return new CommonResult(500,"数据插入失败！");
            }
        }else {
            return  new CommonResult(500,"请求参数错误！");
        }
    }

    @GetMapping(value = "payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        if (id != null && id >0){
            Payment result = paymentService.selectByPrimaryKey(id);
            log.info("*****数据获取结果："+ result +"*****");
            if (result != null){
                return new CommonResult(200,"数据查询成功！",result);
            }else {
                return new CommonResult(500,"该数据不存在！");
            }
        }else {
            return new CommonResult(500,"请求参数出错！");
        }
    }

    @DeleteMapping(value = "payment/remove/{id}")
    public CommonResult remove(@PathVariable("id") Long id){
        if (id != null && id >0){
            int result = paymentService.deleteByPrimaryKey(id);
            log.info("*****数据删除结果："+ result +"*****");
            if (result >0){
                return new CommonResult(200,"删除数据成功！",result);
            }else {
                return new CommonResult(500,"删除数据失败！");
            }
        }else {
            return new CommonResult(500,"请求参数错误！");
        }
    }

    @PutMapping(value = "payment/update")
    public CommonResult update(@RequestBody Payment payment){
        if (payment != null){
            int result = paymentService.updateByPrimaryKey(payment);
            log.info("*****数据修改结果："+ result +"*****");
            if (result > 0){
                return new CommonResult(200,"数据修改成功！",result);
            }else {
                return new CommonResult(500,"数据修改失败！");
            }
        }else {
            return new CommonResult(500,"请求参数错误！");
        }
    }
}
