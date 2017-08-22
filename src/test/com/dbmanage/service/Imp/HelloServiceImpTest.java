package com.dbmanage.service.Imp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dbmanage.service.Imp.HelloServiceImp;
import com.dbmanage.model.hoho;

/**
 * Created by apple on 2017/8/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/configs/spring-mybatis.xml"})
public class HelloServiceImpTest {

    @Autowired
    private HelloServiceImp hsi;


    @Test
    public void testTestSqlService() throws Exception {
        hsi.testSqlService(3);


        hoho hh = new hoho();
        hh.setId(12);
        //hh.setNumber(14);
        //hh.setTest("insertsuccess");
        hsi.insertHoho(hh);
        //int a = 0;
        System.out.println(hsi.testSqlService(3));
    }
}