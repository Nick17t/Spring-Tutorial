package singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {
    public static void main(String[] args) {
        String xmlPath = "singleton/life.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);

        context.close();
    }
}
 