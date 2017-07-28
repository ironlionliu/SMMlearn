package com.springmvc.dao;
import org.apache.ibatis.annotations.Select;
/**
 * Created by apple on 2017/7/27.
 */
public interface testMapper {
    //@Select("SELECT number FROM hoho WHERE id = #{id}")
    public int testSql(int id);
}
