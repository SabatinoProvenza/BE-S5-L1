package sabatinoprovenza.BE_S5_L1.entities;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Order {
    private int orderNumber;
    private OrderStatus status;
    private int seats;
    private LocalDateTime acquisitionTime;
    private Table table;
    private List<MenuItem> items = new ArrayList<>();
    private int coverPrice;


    public Order(int orderNumber, Table table, int seats, int coverPrice) {
        this.orderNumber = orderNumber;
        this.table = table;
        this.seats = seats;
        this.coverPrice = coverPrice;
        this.status = OrderStatus.IN_CORSO;
        this.acquisitionTime = LocalDateTime.now();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotal() {
        double itemsTotal = items.stream()
                .mapToDouble(item -> item.getPrice())
                .sum();

        int coverTotal = coverPrice * seats;
        return itemsTotal + coverTotal;
    }


}
