package com.dbmanage.service;

import com.dbmanage.model.hoho;

import java.util.Map;

/**
 * Created by apple on 2017/8/10.
 */
public interface HelloService {
    hoho testSqlService(int id);
    void insertHoho(hoho hh);
}
