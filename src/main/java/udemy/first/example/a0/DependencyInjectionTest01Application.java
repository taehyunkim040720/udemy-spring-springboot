package udemy.first.example.a0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class OB1 {

}

@Component
class OB2 {

}

@Component
class DITest {
    OB1 ob1;

    OB2 ob2;

    public String printWired() {
        return ob1 +  " and " + ob2;
    }

//    @Autowired
//    public void setOb1(OB1 ob1) {
//        this.ob1 = ob1;
//    }
//
//    @Autowired
//    public void setOb2(OB2 ob2) {
//        this.ob2 = ob2;
//    }

//        public DITest(OB1 ob1, OB2 ob2) {
//        this.ob1 = ob1;
//        this.ob2 = ob2;
//    }
}



@Configuration
@ComponentScan
public class DependencyInjectionTest01Application {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(DependencyInjectionTest01Application.class)
        ) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(DITest.class).printWired());
        }
    }
}
