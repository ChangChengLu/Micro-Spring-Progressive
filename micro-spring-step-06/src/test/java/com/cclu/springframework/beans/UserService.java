package com.cclu.springframework.beans;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 9:42
 */
@Data
public class UserService {

    private String uId;

    private String company;

    private String location;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
    }

}
