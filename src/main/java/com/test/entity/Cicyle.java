package com.test.entity;

import lombok.Data;

/**
 * Created by zhang_htao on 2019/8/10.
 */
@Data
public class Cicyle {
    private String cyle;

    public Cicyle() {
        super();
        System.out.println("Cicyle#constructer()...");
    }

    public void init(){
        System.out.println("Cicyle#init()...");
    }
    public void destroy(){
        System.out.println("Cicyle#destroy()...");
    }
}
