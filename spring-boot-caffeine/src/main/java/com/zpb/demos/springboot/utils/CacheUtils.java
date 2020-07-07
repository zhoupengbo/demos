package com.zpb.demos.springboot.utils;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.utils
 * @Description:
 * @date 2020/7/7 16:03
 */
public class CacheUtils {

    public static String getHello(){
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
