package com.zpb.demos.springboot.service.d1;

import com.zpb.demos.springboot.bean.Money;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.service.d1
 * @Description:
 * @date 2020/7/4 18:11
 */
public interface MoneyService {
    Money selectMoneyById(int id);
}
