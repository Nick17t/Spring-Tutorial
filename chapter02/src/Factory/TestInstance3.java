package Factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestInstance3 {
    public static void main(String[] args) {
        String xmlPath = "Factory/beans3.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        Bean3 bean = (Bean3) applicationContext.getBean("bean3");

        System.out.println(bean);

    }
}

