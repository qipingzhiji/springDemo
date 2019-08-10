package com.test.entity;

import lombok.Data;

/**
 * Created by zhang_htao on 2019/8/10.
 */

@Data
public class Person {
    private String name;
    private String age;
    private String message;
    private City city;

    public Person() {
    }

    public Person(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public Person(String name, String age, String message) {
        this.name = name;
        this.age = age;
        this.message = message;
    }
}
