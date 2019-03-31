package com.tqf.activemq;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * Created by Tang-QiFeng on 2019/3/30
 */
public class Producer {

    private JmsTemplate template;
    private Destination destination;

    public void produce(MyMessage message){
        template.convertAndSend(destination, message);
    }

    public JmsTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JmsTemplate template) {
        this.template = template;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}