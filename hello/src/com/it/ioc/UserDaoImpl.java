package com.it.ioc;

public class UserDaoImpl implements UserDao{
    @Override
    public void say(){
        System.out.println("userDao say hello");
    }
}
