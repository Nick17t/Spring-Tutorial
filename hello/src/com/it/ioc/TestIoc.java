package com.it.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    public static void main(String[] args) {
        //1. 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2. 通过容器调用获取userdao实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //3.调用实例的方法
        userDao.say();

        //这里就是运用了ioc，实例不是new出来的， 是通过spring容器。
    }
}
