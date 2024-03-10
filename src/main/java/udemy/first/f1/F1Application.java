package udemy.first.f1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;
    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println(someDependency);
    }
}

@Component
class SomeDependency {
}

@Configuration
@ComponentScan
public class F1Application {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(F1Application.class);
                ) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
