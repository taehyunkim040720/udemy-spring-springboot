package udemy.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Address(String firstLine, String city) {}
record Person(int age, String name, Address address) {}

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
    public Person person2() {
        return new Person(15, "김제임스", address2());
    }


    @Bean
    public Person person1() {
        return new Person(age(), name(), address());
    }


    @Bean
    public Address address() {
        return new Address("은봉로 289", "인천 남동구");
    }

    @Bean(name = "addressName")
    public Address address2() {
        return new Address("은봉로 288", "인천 남동구");
    }
}
