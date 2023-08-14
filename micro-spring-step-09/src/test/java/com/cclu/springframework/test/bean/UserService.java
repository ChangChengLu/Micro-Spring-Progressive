package com.cclu.springframework.test.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ChangCheng Lu
 * @date 2023/8/14 17:09
 */
@Setter
@Getter
public class UserService {

    private String uId;

    private String company;

    private String location;

    private IUserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "," + company + "," + location;
    }

}
