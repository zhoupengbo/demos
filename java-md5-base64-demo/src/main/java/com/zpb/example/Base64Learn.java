package com.zpb.example;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author zhoupb
 * @Package com.zpb.example
 * @Description:
 * @date 2020/7/7 14:17
 */
public class Base64Learn {
    public static void main(String[] args) {
        String str = "hbase:default:wo_shi-shensdfasdfas12";
        String base64Str = Base64.encodeBase64String(str.getBytes());
        System.out.println("base64加密-->" + base64Str);

        // Base64解密
        String base64DecodeStr = new String(Base64.decodeBase64(base64Str));
        System.out.println("base64解密-->" + base64DecodeStr);
    }
}
