package com.cclu.springframework;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 10:21
 */
@Data
public class Student {

    private String name;

    private int age;

    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
