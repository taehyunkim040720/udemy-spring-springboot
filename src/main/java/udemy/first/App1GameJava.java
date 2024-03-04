package udemy.first;

import udemy.first.game.GameConsole;
import udemy.first.game.GameRunner;
import udemy.first.game.PacManGame;
import udemy.first.game.SuperContraGame;

public class App1GameJava {
    public static void main(String[] args) {
        GameConsole superContraGame = new SuperContraGame();
        GameConsole pacmanGame = new PacManGame();
        GameRunner gameRunner = new GameRunner(pacmanGame);

        gameRunner.run();
    }
}
