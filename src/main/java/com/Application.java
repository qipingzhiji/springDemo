package com;

import com.alibaba.druid.pool.DruidDataSource;
import com.test.entity.Cicyle;
import com.test.entity.DataSourseProperties;
import com.test.entity.Person;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhang_htao on 2019/8/10.
 */
public class Application {
    public static void main(String[] args) throws Exception{
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cycle.xml");
        Cicyle cicyle = (Cicyle) ctx.getBean("cycle");
        System.out.println(cicyle);
    }
}
