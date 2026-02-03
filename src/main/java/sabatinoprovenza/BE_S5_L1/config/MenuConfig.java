package sabatinoprovenza.BE_S5_L1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sabatinoprovenza.BE_S5_L1.entities.Drink;
import sabatinoprovenza.BE_S5_L1.entities.Pizza;
import sabatinoprovenza.BE_S5_L1.entities.Topping;

@Configuration
public class MenuConfig {

    // -------- TOPPINGS --------
    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    public Topping onions() {
        return new Topping("Onions", 0.69, 22);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 0.79, 24);
    }

    @Bean
    public Topping salami() {
        return new Topping("Salami", 0.99, 86);
    }

    // -------- DRINKS --------
    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 1.29, 128);
    }

    @Bean
    public Drink water() {
        return new Drink("Water (0.5l)", 1.29, 0);
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine (0.75l, 13%)", 7.49, 607);
    }

    // -------- PIZZAS --------
    @Bean
    public Pizza margheritaPizza() {
        return new Pizza("Pizza Margherita", 4.99, 1104);
    }

    @Bean
    public Pizza hawaiianPizza(Topping ham, Topping pineapple) {
        Pizza p = new Pizza("Hawaiian Pizza", 4.99, 1104);
        p.addTopping(ham);
        p.addTopping(pineapple);
        return p;
    }

    @Bean
    public Pizza salamiPizza(Topping salami) {
        Pizza p = new Pizza("Salami Pizza", 4.99, 1104);
        p.addTopping(salami);
        return p;
    }

    @Bean
    public Pizza doubleSalamiPizza(Topping salami) {
        Pizza p = new Pizza("Margherita Double salami", 4.99, 1104);
        p.addTopping(salami, 2);
        return p;
    }

    // -------- MENU --------
//    @Bean
//    public Menu menu(
//            Pizza margheritaPizza,
//            Pizza hawaiianPizza,
//            Pizza salamiPizza,
//            Pizza doubleSalamiPizza,
//            Topping cheese,
//            Topping ham,
//            Topping onions,
//            Topping pineapple,
//            Topping salami,
//            Drink lemonade,
//            Drink water,
//            Drink wine
//    ) {
//       return new Menu(
//                List.of(margheritaPizza, hawaiianPizza, salamiPizza, doubleSalamiPizza),
//               List.of(cheese, ham, onions, pineapple, salami),
//                List.of(lemonade, water, wine)
//        );
//    }
}

