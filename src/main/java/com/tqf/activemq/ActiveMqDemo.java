package com.tqf.activemq;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Created by Tang-QiFeng on 2019/3/30
 */
public class ActiveMqDemo {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-jms.xml");
        Producer producer = (Producer) context.getBean("producer");
        for(int i=0;i<10;i++){
            MyMessage myMessage = new MyMessage();
            System.out.println("生产第"+i+"条消息！");
            myMessage.setText("第"+i+"条消息！");
            producer.produce(myMessage);
        }
    }
}