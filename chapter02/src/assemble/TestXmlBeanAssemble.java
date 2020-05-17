package assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlBeanAssemble {
    public static void main(String[] args) {
        String xmlPath = "assemble/beans5.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("user1"));
        System.out.println(applicationContext.getBean("user2"));
    }
}
