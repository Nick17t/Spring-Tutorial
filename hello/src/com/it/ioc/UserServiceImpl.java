package com.it.ioc;

public class UserServiceImpl implements UserSevice {
    //����userDao
    private UserDao userDao;
    //���userDao���Ե�setter����������ʵ������ע��
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
        public void say(){

            this.userDao.say();

            System.out.println("UserService say hello");
        }
    }
