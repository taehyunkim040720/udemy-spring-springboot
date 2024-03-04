package udemy.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import udemy.first.game.GameConsole;
import udemy.first.game.GameRunner;
import udemy.first.game.PacManGame;
import udemy.first.game.SuperContraGame;

public class App2GameJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(applicationContext.getBean("name"));
        System.out.println(applicationContext.getBean("age"));
        System.out.println(applicationContext.getBean("person"));
    }
}
