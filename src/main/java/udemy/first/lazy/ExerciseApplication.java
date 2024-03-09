package udemy.first.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class ClassA {

}

@Component
@Lazy

class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("hello");
        this.classA = classA;
    }

    public void hello() {
        System.out.println("ralo");
    }
}


@Configuration
@ComponentScan
public class ExerciseApplication {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExerciseApplication.class)) {
            System.out.println("initial");
//            context.getBean(ClassB.class).hello();
        }
    }
}
