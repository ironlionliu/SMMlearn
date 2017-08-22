package com.dbmanage.dao;
import com.dbmanage.model.hoho;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * Created by apple on 2017/8/21.
 */
public interface testdao {
    //@Select("SELECT number FROM hoho WHERE id = #{id}")
    hoho testSql(int id);
    void inserHoho(hoho hh);
}