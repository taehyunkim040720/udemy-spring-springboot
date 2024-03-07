package udemy.first.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameRunner {
    GameConsole game;

    public GameRunner(GameConsole game) {
         this.game = game;
     }

     @Bean
     public void run() {
         game.up();
         game.down();
         game.left();
         game.right();
     }
}
