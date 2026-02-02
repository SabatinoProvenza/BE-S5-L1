package sabatinoprovenza.BE_S5_L1.entities;

import java.util.List;

public class Menu {

    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public void printMenu() {
        System.out.println("=== MENU ===\n");

        System.out.printf("%-60s %10s %10s%n", "Pizzas", "Calories", "Price");

        pizzas.forEach(p -> System.out.printf(
                "%-60s %10d %10.2f%n",
                p.getName(),
                p.getCalories(),
                p.getPrice()
        ));

        System.out.println();

        System.out.printf("%-60s %10s %10s%n", "Toppings", "Calories", "Price");

        toppings.forEach(t -> System.out.printf(
                "%-60s %10d %10.2f%n",
                t.getName(),
                t.getCalories(),
                t.getPrice()
        ));

        System.out.println();

        System.out.printf("%-60s %10s %10s%n", "Drinks", "Calories", "Price");

        drinks.forEach(d -> System.out.printf(
                "%-60s %10d %10.2f%n",
                d.getName(),
                d.getCalories(),
                d.getPrice()
        ));
    }
}



