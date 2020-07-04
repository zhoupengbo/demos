package com.zpb.demos.springboot.dao.d1;

import com.zpb.demos.springboot.bean.Money;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.dao.d1
 * @Description:
 * @date 2020/7/4 18:10
 */

public interface MoneyDao {
    /**
     * 通过id 查看工资详情
     */
    @Select("SELECT * FROM money WHERE id = #{id}")
    Money findMoneyById(@Param("id") int id);
}
