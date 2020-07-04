package com.zpb.demos.springboot.dao.d2;

import com.zpb.demos.springboot.bean.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.dao.d2
 * @Description:
 * @date 2020/7/4 18:10
 */

public interface UserDao {
    /**
     * 通过名字查询用户信息
     */
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findUserByName(String name);
}
