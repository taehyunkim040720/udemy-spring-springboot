package udemy.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import udemy.first.game.GameConsole;
import udemy.first.game.GameRunner;

@Configuration
@ComponentScan("udemy.first.game")
public class App3GameBeans {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(App3GameBeans.class);
                ) {
            context.getBean(GameConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
