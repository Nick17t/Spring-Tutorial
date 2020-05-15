package instance.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInstance1 {
    public static void main(String[] args) {
        //定义配置文件路径
        String xmlPath = "instance/contructor/beans1.xml";

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        Bean1 bean = (Bean1) applicationContext.getBean("bean1");

        System.out.println(bean);

    }
}
