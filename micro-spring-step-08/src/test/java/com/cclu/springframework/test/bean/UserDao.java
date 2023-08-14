package com.cclu.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/8/13 14:45
 */
public class UserDao {

    private final static Map<String, String> userMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("执行：init-method");
        userMap.put("1001", "木子");
        userMap.put("1002", "小一");
        userMap.put("1003", "阿同");
    }

    public void destroyDataMethod(){
        System.out.println("执行：destroy-method");
        userMap.clear();
    }

    public String queryUserName(String uId) {
        return userMap.get(uId);
    }

}
