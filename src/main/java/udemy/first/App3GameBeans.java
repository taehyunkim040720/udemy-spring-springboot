package udemy.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import udemy.first.game.GameConsole;
import udemy.first.game.GameRunner;
import udemy.first.game.PacManGame;

@Configuration
public class App3GameBeans {

    @Bean
    public GameConsole game() {
        return new PacManGame();
    }

    @Bean GameRunner gameRunner(GameConsole game) {
        return new GameRunner(game);
    }

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(App3GameBeans.class);
                ) {
            context.getBean(GameConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
