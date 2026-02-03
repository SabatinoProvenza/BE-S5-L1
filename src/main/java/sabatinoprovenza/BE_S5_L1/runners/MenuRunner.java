package sabatinoprovenza.BE_S5_L1.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import sabatinoprovenza.BE_S5_L1.entities.Menu;


@Component
@PropertySource("application.properties")
public class MenuRunner implements CommandLineRunner {
    @Value("${menu.coverPrice}")
    private int coverPrice;
    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {

        printMenu();
        System.out.println();
        System.out.println("Coperto: " + coverPrice + "€");
        System.out.println();
    }

    public void printMenu() {
        System.out.println("=== MENU ===\n");

        System.out.printf("%-60s %10s %10s%n", "Pizzas", "Calories", "Price");

        menu.getPizzas().forEach(p -> System.out.printf(
                "%-60s %10d %10.2f%n",
                p.getName(),
                p.getCalories(),
                p.getPrice()
        ));

        System.out.println();

        System.out.printf("%-60s %10s %10s%n", "Toppings", "Calories", "Price");

        menu.getToppings().forEach(t -> System.out.printf(
                "%-60s %10d %10.2f%n",
                t.getName(),
                t.getCalories(),
                t.getPrice()
        ));

        System.out.println();

        System.out.printf("%-60s %10s %10s%n", "Drinks", "Calories", "Price");

        menu.getDrinks().forEach(d -> System.out.printf(
                "%-60s %10d %10.2f%n",
                d.getName(),
                d.getCalories(),
                d.getPrice()
        ));
    }
}
