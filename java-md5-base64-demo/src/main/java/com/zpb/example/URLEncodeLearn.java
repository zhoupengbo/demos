package com.zpb.example;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author zhoupb
 * @Package com.zpb.example
 * @Description:
 * @date 2020/7/7 14:27
 */
public class URLEncodeLearn {

    public static void main(String[] args) throws UnsupportedEncodingException {

        // gbk
        String encode = URLEncoder.encode("GBK编码", "GBK");
        System.out.println("乱码:" + encode);
        String decode = URLDecoder.decode(encode, "GBK");// GBK解码
        System.out.println(decode);
        // utf-8
        String encode2 = URLEncoder.encode("UTF8编码", "UTF8");
        System.out.println("乱码:" + encode2);
        String decode2 = URLDecoder.decode(encode2, "UTF8");// UTF解码
        System.out.println(decode2);
    }
}
