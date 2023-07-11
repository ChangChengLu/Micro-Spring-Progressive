package com.cclu.springframework.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 9:42
 */
public class UserDao {

    private static Map<String, String> userMap = new HashMap<>();

    static {
        userMap.put("1001", "木子");
        userMap.put("1002", "小艺");
        userMap.put("1003", "阿同");
    }

    public String queryUserName(String uId) {
        return userMap.get(uId);
    }

}
