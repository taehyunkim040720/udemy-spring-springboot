package udemy.first.game;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private GameConsole game;

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
