package singleton;

public class life {
    //构造方法，也就是实例化
    public life(){
        System.out.println("life start");
    }
    //初始化方法
    public void initMethod(){
        System.out.println("initMethod start");
    }
    //销毁方法
    public void destroyMethod(){
        System.out.println("destroyMethod start");
    }

}
