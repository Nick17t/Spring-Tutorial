package com.it.ioc;

public class UserServiceImpl implements UserSevice {
    //声明userDao
    private UserDao userDao;
    //添加userDao属性的setter方法，用于实现依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
        public void say(){

            this.userDao.say();

            System.out.println("UserService say hello");
        }
    }
