package com.dbmanage.service.Imp;

import com.dbmanage.dao.testdao;
import com.dbmanage.model.hoho;
import com.dbmanage.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by apple on 2017/8/21.
 */
@Service
public class HelloServiceImp implements HelloService {
    @Autowired
    private testdao td;
    public hoho testSqlService(int id){
        hoho result = td.testSql(id);
        return result;
    }
    public  void insertHoho(hoho hh){
        td.inserHoho(hh);
    }
}
