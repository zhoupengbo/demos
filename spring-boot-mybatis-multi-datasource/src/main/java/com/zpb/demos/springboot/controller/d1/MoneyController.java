package com.zpb.demos.springboot.controller.d1;

import com.zpb.demos.springboot.bean.Money;
import com.zpb.demos.springboot.service.d1.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.controller.d1
 * @Description:
 * @date 2020/7/4 18:10
 */
@RestController
@RequestMapping("/money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;

    @RequestMapping("/query")
    public Money testQuery() {
        return moneyService.selectMoneyById(20);
    }

}
