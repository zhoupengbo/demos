package com.zpb.demos.springboot.service;

import com.zpb.demos.springboot.utils.CacheUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.service
 * @Description: 使用@CacheConfig便于用指定value
 * @date 2020/7/7 14:51
 */
@Service
@CacheConfig(cacheNames = "caffeineCacheManager")
public class Hello3ServiceImpl implements Hello3Service {

    @Override
    @Cacheable(key = "#name")
    public String sayHello(String name) {
        return CacheUtils.getHello();
    }
}
