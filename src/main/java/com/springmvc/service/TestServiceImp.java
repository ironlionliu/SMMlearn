package com.springmvc.service;
import com.springmvc.dao.testMapper;
import com.springmvc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 2017/7/27.
 */
@Service
public class TestServiceImp implements TestService {
    @Autowired
    private testMapper tm;

    public int testSqlService(int id){
        return tm.testSql(id);
    }

}
