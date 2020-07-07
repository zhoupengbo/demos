package com.zpb.demos.springboot.service;

import com.zpb.demos.springboot.utils.CacheUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.service
 * @Description: 指定value不必声明@CacheConfig
 * @date 2020/7/7 14:51
 */
@Service
public class Hello4ServiceImpl implements Hello4Service {

    @Override
    @Cacheable(value = "IZUUL",key = "#name")
    public String sayHello(String name) {
        return CacheUtils.getHello();
    }
}
