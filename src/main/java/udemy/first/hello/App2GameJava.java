package udemy.first.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App2GameJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(applicationContext.getBean("name"));
        System.out.println(applicationContext.getBean("age"));
        System.out.println(applicationContext.getBean("address"));
        System.out.println(applicationContext.getBean("person1"));
        System.out.println(applicationContext.getBean("addressName"));


        String[] beanNames = applicationContext.getBeanDefinitionNames();


        Arrays.sort(beanNames);


        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

    }
}
