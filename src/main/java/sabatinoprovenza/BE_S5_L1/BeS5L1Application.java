package sabatinoprovenza.BE_S5_L1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sabatinoprovenza.BE_S5_L1.entities.Menu;

@SpringBootApplication
public class BeS5L1Application {

    public static void main(String[] args) {
        SpringApplication.run(BeS5L1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeS5L1Application.class);


        Menu menu = ctx.getBean(Menu.class);
        menu.printMenu();

    }

}
