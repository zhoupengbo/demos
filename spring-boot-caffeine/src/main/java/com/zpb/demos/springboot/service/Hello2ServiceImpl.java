package com.zpb.demos.springboot.service;

import com.zpb.demos.springboot.utils.CacheUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.service
 * @Description: 指定value不必声明@CacheConfig
 * @date 2020/7/7 14:51
 */
@Service
public class Hello2ServiceImpl implements Hello2Service {

    @Override
    @Cacheable(value = "caffeineCacheManager",key = "#name")
    public String sayHello(String name) {
        return CacheUtils.getHello();
    }
}
