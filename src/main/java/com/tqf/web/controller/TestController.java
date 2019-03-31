package com.tqf.web.controller;

import com.tqf.activemq.MyMessage;
import com.tqf.activemq.Producer;
import com.tqf.test.TestBean;
import com.tqf.test.TestDao;
import com.tqf.web.servcie.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Tang-QiFeng on 2019/3/28
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private TestService testService;

    @Autowired
    private TestDao testDao;

    /**
     *  http://localhost:8080/test/hello
     *
     * @return
     */
    @RequestMapping(value ="/hello",produces={"application/json;","text/html;charset=UTF-8;"})
    public String hello(){
        String sql="select * from tb_user";
        List list=jdbcTemplate.queryForList(sql);
        System.out.println(list.size());
        return "hello";
    }

    /**
     *  http://localhost:8080/test/activemq
     *
     * @return
     */
    @RequestMapping(value ="/activemq",produces={"application/json;","text/html;charset=UTF-8;"})
    public String activemq(){
        String result=testService.producermsg();
        return result;
    }

    /**
     *  http://localhost:8080/test/testbean
     *
     * @return
     */
    @RequestMapping(value ="/testbean",produces={"application/json;","text/html;charset=UTF-8;"})
    public String testbean(){
        return testDao.getusername();
    }

}
