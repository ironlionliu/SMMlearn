package com.springmvc.service.Imp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.springmvc.service.TestServiceImp;

/**
 * Created by apple on 2017/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/configs/spring-mybatis.xml"})
public class testServiceImpTest {
    @Autowired
    private TestServiceImp tsi;


    @Test
    public void testTestSqlService() throws Exception {
        int a = tsi.testSqlService(3);
        //int a = 0;
        System.out.println(a);
    }
}