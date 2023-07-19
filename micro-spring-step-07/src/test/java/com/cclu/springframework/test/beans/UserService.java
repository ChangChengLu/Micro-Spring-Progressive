package com.cclu.springframework.test.beans;

import com.cclu.springframework.beans.factory.DisposableBean;
import com.cclu.springframework.beans.factory.InitializingBean;
import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/7/19 13:46
 */
@Data
public class UserService implements InitializingBean, DisposableBean {

    private String uId;

    private String company;

    private String location;

    private UserDao userDao;

    @Override
    public void destroy() throws Exception {
        System.out.println("执行：UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行：UserService.afterPropertiesSet");
    }

    public void queryUserInfo() {
        System.out.println(toString());
        System.out.println();
    }

    @Override
    public String toString() {
        return "UserService{" +
                "uId='" + uId + '\'' +
                ", userName='" + userDao.queryUserName(uId) + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
