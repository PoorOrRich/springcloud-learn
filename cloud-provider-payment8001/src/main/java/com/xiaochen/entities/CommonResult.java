package com.xiaochen.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * 响应码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;

    /**
     * 两个参数的构造
     * @param code
     * @param message
     */
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
