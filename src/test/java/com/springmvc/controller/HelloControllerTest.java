package com.springmvc.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.springmvc.service.TestServiceImp;
import com.springmvc.controller.testspring;
import com.springmvc.controller.HelloController;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by apple on 2017/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/configs/spring-mybatis.xml"})
public class HelloControllerTest {
    //@Autowired
    //private TestServiceImp tsi;
    //private HelloController hc;
    //private HelloController hc = new HelloController();
    @Test
    public void testHelloWorld() throws Exception {
        HelloController hc = new HelloController();
        //int a = tsi.testSqlService(3);
        //int a = 0;
        //System.out.println(hc.testspring.getMytest());

    }
}