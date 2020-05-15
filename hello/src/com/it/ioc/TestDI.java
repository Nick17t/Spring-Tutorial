package com.it.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.attribute.AclFileAttributeView;

public class TestDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserSevice userSevice = (UserSevice) applicationContext.getBean("userService");

        userSevice.say();

    }
}
