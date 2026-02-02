package sabatinoprovenza.BE_S5_L1.entities;


import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem {

    private String baseAdds = "tomato, cheese";
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
    }

    // aggiunge un topping
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    // aggiunge più volte lo stesso topping
    public void addTopping(Topping topping, int quantity) {
        for (int i = 0; i < quantity; i++) {
            toppings.add(topping);
        }
    }

    @Override
    public double getPrice() {
        double total = super.getPrice();

        for (Topping t : toppings) {
            total += t.getPrice();
        }

        return total;
    }

    @Override
    public int getCalories() {
        int total = super.getCalories();

        for (Topping t : toppings) {
            total += t.getCalories();
        }

        return total;
    }

    @Override
    public String getName() {
        String name = super.getName() + " (" + baseAdds;

        for (Topping t : toppings) {
            name += ", " + t.getName();
        }

        name += ")";
        return name;
    }
}

