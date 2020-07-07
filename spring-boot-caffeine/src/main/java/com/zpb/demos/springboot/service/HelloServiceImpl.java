package com.zpb.demos.springboot.service;

import ch.qos.logback.core.util.TimeUtil;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.stats.CacheStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.service
 * @Description:
 * @date 2020/7/7 14:51
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    Cache<String, Object> caffeineCache;
    @Autowired
    CacheManager cacheManager;

    @Override
    public String sayHello(String name) {

        CacheStats stats = caffeineCache.stats();
        stats.hitRate();
        stats.averageLoadPenalty();
        stats.hitCount();

        String time = (String)caffeineCache.asMap().get(name);
        if(StringUtils.isEmpty(time)){
            time=getInfo();
        }else{
            return time;
        }
        if(!StringUtils.isEmpty(time)){
            System.out.println("写缓存。。。");
            caffeineCache.put(name,time);
        }
        return time;
    }

    public String getInfo(){
        try {
            System.out.println("小睡5秒。。。");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("睡饱了~~~");
        return LocalDate.now()+" "+ LocalTime.now();
    }
}
