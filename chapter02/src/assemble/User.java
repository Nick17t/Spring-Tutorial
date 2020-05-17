package assemble;

import java.util.List;

public class User {
    private String UserName;
    private Integer password;
    private List<String> list;
/*
* 1. ʹ�ù���ע��
* 1.1 �ṩ�����в������вι��췽��
* */
    public User(String userName, Integer password, List<String> list) {
        super();
        this.UserName = userName;
        this.password = password;
        this.list = list;
    }


    /*
    * 2.ʹ����ֵע��
    * 2.1�ṩĬ�Ͽղι���
    * 2.2Ϊ���������ṩsetter����
    * */
    public User() {
        super();
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", password=" + password +
                ", list=" + list +
                '}';
    }
}
