package com.zpb.demos.springboot.mapper;

import com.zpb.demos.springboot.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.mapper
 * @Description: 方式二
 * @date 2020/6/23 22:42
 */
public interface UserXmlMapper {

    List<User> getXmlAllUsers();
    int getXmlAgeByName(String name);
}
