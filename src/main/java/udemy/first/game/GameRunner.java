package udemy.first.game;

public class GameRunner {
     GameConsole game;

     public GameRunner(GameConsole game) {
         this.game = game;
     }

     public void run() {
         game.up();
         game.down();
         game.left();
         game.right();
     }
}
