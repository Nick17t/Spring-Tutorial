package com.it.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    public static void main(String[] args) {
        //1. ��ʼ��Spring���������������ļ�
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2. ͨ���������û�ȡuserdaoʵ��
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //3.����ʵ���ķ���
        userDao.say();

        //�������������ioc��ʵ������new�����ģ� ��ͨ��spring������
    }
}
