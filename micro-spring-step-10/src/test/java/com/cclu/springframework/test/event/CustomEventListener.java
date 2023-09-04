package com.cclu.springframework.test.event;

import com.cclu.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @author ChangCheng Lu
 * @date 2023/8/16 13:50
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到: " + event.getSource() + "消息;时间: " + new Date());
        System.out.println("消息ID" + event.getId() + ": " + event.getMessage());
    }

}
