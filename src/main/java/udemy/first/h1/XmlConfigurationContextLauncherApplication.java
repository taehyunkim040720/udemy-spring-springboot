package udemy.first.h1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigurationContextLauncherApplication {
    public static void main(String[] args) {
//        try (AnnotationConfigApplicationContext context =
//                     new AnnotationConfigApplicationContext(udemy.first.f1.F1Application.class);
//        ) {
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        }
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("number"));

        }
    }
}

