package udemy.first.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2GameJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(applicationContext.getBean("name"));
        System.out.println(applicationContext.getBean("age"));
//        System.out.println(applicationContext.getBean("person"));
        System.out.println(applicationContext.getBean("address"));
        System.out.println(applicationContext.getBean("person1"));
        System.out.println(applicationContext.getBean("person2"));
        System.out.println(applicationContext.getBean("addressName"));
        System.out.println(applicationContext.getBean(Address.class));
        System.out.println(applicationContext.getBean(Person.class));
        System.out.println(applicationContext.getBean("person4") + "d");
        System.out.println(applicationContext.getBean("person5"));
    }
}
