package com.zpb.demos.springboot.enums;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.enums
 * @Description:
 * @date 2020/7/7 18:00
 */
public enum  CacheType {
    IZUUL(10),

    MUMU(5);

    private int expires;

    CacheType(int expires) {
        this.expires = expires;
    }

    public int getExpires() {
        return expires;
    }
}
