package com.xiaochen.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * payment
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * 主键Id
     */
    private Long id;

    /**
     * 支付流水号
     */
    private String serial;

    private static final long serialVersionUID = 1L;
}