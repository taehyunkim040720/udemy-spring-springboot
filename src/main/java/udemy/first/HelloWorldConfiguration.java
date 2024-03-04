package udemy.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(int age, String name) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "taehyun";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person(19, "taek");
    }
}
