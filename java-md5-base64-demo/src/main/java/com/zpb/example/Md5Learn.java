package com.zpb.example;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author zhoupb
 * @Package com.zpb.example
 * @Description:
 * @date 2020/7/7 14:16
 */
public class Md5Learn {
    public static void main(String[] args) {
        String str = "hbase:default:wo_shi-shensdfasdfas12";
        // 32位小写
        String md5Str = DigestUtils.md5Hex(str);
        // 32位大写
        String md5StrToUpper = DigestUtils.md5Hex(str).toUpperCase();
        // 16位小写
        String subMd5Str = DigestUtils.md5Hex(str).substring(8, 24);
        // 16位大写
        String subMd5StrToUpper = DigestUtils.md5Hex(str).substring(8, 24).toUpperCase();

        System.out.println(md5Str);
        System.out.println(md5StrToUpper);
        System.out.println(subMd5Str);
        System.out.println(subMd5StrToUpper);
    }
}
