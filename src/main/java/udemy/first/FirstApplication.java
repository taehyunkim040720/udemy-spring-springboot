package udemy.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import udemy.first.game.*;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        GameConsole superContraGame = new SuperContraGame();
        GameConsole pacmanGame = new PacManGame();
        GameRunner gameRunner = new GameRunner(pacmanGame);

        gameRunner.run();
    }

}
