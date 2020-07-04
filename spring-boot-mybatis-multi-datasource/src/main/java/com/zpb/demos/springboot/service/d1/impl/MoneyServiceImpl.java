package com.zpb.demos.springboot.service.d1.impl;

import com.zpb.demos.springboot.bean.Money;
import com.zpb.demos.springboot.dao.d1.MoneyDao;
import com.zpb.demos.springboot.service.d1.MoneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.service.d1.impl
 * @Description:
 * @date 2020/7/4 18:12
 */
@Service
public class MoneyServiceImpl implements MoneyService {

    @Resource
    private MoneyDao moneyDao;

    @Override
    public Money selectMoneyById(int id) {
        return moneyDao.findMoneyById(id);
    }
}
