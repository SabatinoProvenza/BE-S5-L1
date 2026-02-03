package sabatinoprovenza.BE_S5_L1.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sabatinoprovenza.BE_S5_L1.entities.Drink;
import sabatinoprovenza.BE_S5_L1.entities.Order;
import sabatinoprovenza.BE_S5_L1.entities.Pizza;
import sabatinoprovenza.BE_S5_L1.entities.Table;

@Component
public class OrdersRunner implements CommandLineRunner {


    @Value("${menu.coverPrice}")
    private int coverPrice;
    @Autowired
    @Qualifier("margheritaPizza")
    private Pizza margherita;
    @Autowired
    @Qualifier("water")
    private Drink water;


    @Override
    public void run(String... args) {
        Table t1 = new Table(1, 4);
        t1.setOccupied(true);

        Order o1 = new Order(1, t1, 2, coverPrice);

        o1.addItem(margherita);
        o1.addItem(water);

        System.out.println("Ordine creato:");
        System.out.println("Numero ordine: " + o1.getOrderNumber());
        System.out.println("Tavolo " + o1.getTable().getTableNumber());
        System.out.println("N coperti: " + o1.getSeats());
        System.out.println("Stato dell' ordine: " + o1.getStatus());
        System.out.println("Dettaglio ordine: ");
        o1.getItems().forEach(menuItem ->
                System.out.println("- " + menuItem.getName() + " : " + menuItem.getPrice() + " €")
        );
        System.out.println("Totale dell'ordine: " + o1.getTotal() + " €");
    }
}