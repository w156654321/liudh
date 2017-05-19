package com.enh.mq.service;

/***
 *
 * 描    述：
 *
 * 创 建 者： liudh
 * 创建时间： 2017/5/18 14:00
 * 创建描述：
 *
 */
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.util.Date;

public class RabbitmqService implements MessageListener {
    public void onMessage(Message message) {
        System.out.println("消息消费者client消费： = " + message.toString()+"时间:"+new Date());
    }
}