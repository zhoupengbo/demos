package com.zpb.demos.springboot.bean;

import lombok.Data;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.bean
 * @Description:
 * @date 2020/7/4 17:43
 */
@Data
public class Money {
    private int id;
    private int basic;
    private int reward;
    private int punishment;
}
