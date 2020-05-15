package static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInstance {
    public static void main(String[] args) {
        String xmlPath = "static_factory/beans2.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        //其实可以直接 application.getBean("bean2").sout;

        Bean2 bean = (Bean2) applicationContext.getBean("bean2");

        System.out.println(bean);



    }
}
