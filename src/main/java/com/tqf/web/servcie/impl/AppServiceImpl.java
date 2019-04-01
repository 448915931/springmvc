package com.tqf.web.servcie.impl;

import com.tqf.web.servcie.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Tang-QiFeng on 2019/4/1
 */
@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private JdbcTemplate imcJdbc;

    @Override
    public String gettestapp(){
        System.out.println(imcJdbc.getDataSource());
        return "哈哈";
    }
}
