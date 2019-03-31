package com.tqf.web.servcie.impl;

import com.tqf.activemq.MyMessage;
import com.tqf.activemq.Producer;
import com.tqf.web.servcie.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tang-QiFeng on 2019/3/31
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private Producer producer;
    @Autowired
    private Producer producer2;



    @Override
    public String producermsg() {
        for(int i=0;i<10;i++){
            MyMessage myMessage = new MyMessage();
            System.out.println("生产第"+i+"条消息！");
            myMessage.setText("第"+i+"条消息！");
            producer.produce(myMessage);
            producer2.produce(myMessage);
        }
        return "成功";
    }
}
