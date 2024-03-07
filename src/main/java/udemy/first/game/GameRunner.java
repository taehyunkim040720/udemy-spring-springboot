package udemy.first.game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

     public void run() {
        System.out.println(game);
         game.up();
         game.down();
         game.left();
         game.right();
     }
}
