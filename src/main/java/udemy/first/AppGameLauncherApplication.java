package udemy.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import udemy.first.game.GameConsole;
import udemy.first.game.GameRunner;

@Configuration
@ComponentScan("udemy.first.game")
public class AppGameLauncherApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppGameLauncherApplication.class);
                ) {
            GameConsole g1 = context.getBean(GameConsole.class);
            context.getBean(GameRunner.class).run();
            GameConsole g2 = context.getBean(GameConsole.class);
            context.getBean(GameRunner.class).run();
            GameConsole g3 = context.getBean(GameConsole.class);
            context.getBean(GameRunner.class).run();
        }
    }
}
