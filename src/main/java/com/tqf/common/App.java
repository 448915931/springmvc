package com.tqf.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Tang-QiFeng on 2019/4/1
 */
@Service
public class App {

    private String result;

    @Autowired
    private JdbcTemplate imcJdbc;

    public App(String result){
        this.result=result;
    }

    public String gettestapp(){
        System.out.println(imcJdbc.getDataSource());
        return result;
    }
}
