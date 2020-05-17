package assemble;

import java.util.List;

public class User {
    private String UserName;
    private Integer password;
    private List<String> list;
/*
* 1. 使用构造注入
* 1.1 提供带所有参数的有参构造方法
* */
    public User(String userName, Integer password, List<String> list) {
        super();
        this.UserName = userName;
        this.password = password;
        this.list = list;
    }


    /*
    * 2.使用设值注入
    * 2.1提供默认空参构造
    * 2.2为所有属性提供setter方法
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
