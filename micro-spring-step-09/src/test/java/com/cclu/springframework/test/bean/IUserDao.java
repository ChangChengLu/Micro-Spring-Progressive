package com.cclu.springframework.test.bean;

/**
 * @author ChangCheng Lu
 * @date 2023/8/14 17:04
 */
public interface IUserDao {

    /**
     * query user's name
     * @param uId
     * @return
     */
    String queryUserName(String uId);

}
