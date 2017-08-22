package com.dbmanage.controller;

import com.dbmanage.model.hoho;
import com.dbmanage.service.Imp.HelloServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





/**
 * Created by apple on 2017/8/3.
 */
@ContextConfiguration(locations = {"classpath*:/configs/spring-mybatis.xml"})
@Controller
@RequestMapping(value="/hello")
public class hello {

    @Autowired
    private HelloServiceImp tsi;


    class test{
        private String hi;

        public String getHi() {
            return hi;
        }

        public void setHi(String hi) {
            this.hi = hi;
        }
    }

    @RequestMapping(value="/testsql")
    public void testsql(){
        //Map a = tsi.testSqlService(3);
        //System.out.println(a);
        //return "ng2";
    }






    @RequestMapping(value="/test")
    public String helloworld(){
        return "hello";
    }


    @RequestMapping(value="/ngtest")
    public String ngtest(){
        return "ng2";
    }


    @RequestMapping(value="/testjson",method= RequestMethod.GET)
    @ResponseBody
    public Object testjson(){
        Map<String,Object> test = new HashMap<String, Object>();
        test.put("test","success");

        System.out.print("test");
        System.out.print(test);
        return test;
    }


    @RequestMapping(value="/testget",method=RequestMethod.GET)
    @ResponseBody
    public test mygettest(HttpServletRequest request){
        System.out.println("get方法");
        System.out.println(request);
        System.out.println(request.getParameter("courseId"));
        test ts = new test();
        ts.setHi("hi");
        System.out.println(ts.getHi());
        return ts;
    }


    @RequestMapping(value="/testpost",method=RequestMethod.POST)
    @ResponseBody
    public hoho myposttest(HttpServletRequest request){
        System.out.println("post方法");
        System.out.println(request);
        System.out.println(request.getParameter("test"));
        System.out.println(request.getParameter("success"));
        test ts = new test();
        ts.setHi("hi");
        //tsi.testSqlService(2);
        System.out.println(ts.getHi());
        return tsi.testSqlService(2);
    }


    @RequestMapping(value="/hoho")
    @ResponseBody
    public Object getJson(){
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("fd", "郝鹏");
        return map;
    }
}
