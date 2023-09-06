package com.cclu.springframework.test.bean;

import com.cclu.springframework.stereotype.Component;
import lombok.Data;

import java.util.Random;

/**
 * @author ChangCheng Lu
 * @date 2023/9/6 14:36
 */
@Data
@Component("userService")
public class UserService implements IUserService {

    private String token;

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "木子，10001，上海";
    }

    @Override
    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success!";
    }

    @Override
    public String toString() {
        return "UserService#token = { " + token + " }";
    }
}
