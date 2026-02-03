package sabatinoprovenza.BE_S5_L1.entities;

public class Table {

    private int tableNumber;
    private int maxSeats;
    private boolean occupied;

    public Table(int tableNumber, int maxSeats) {
        this.tableNumber = tableNumber;
        this.maxSeats = maxSeats;
        this.occupied = false;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "Table " + tableNumber +
                " (maxSeats=" + maxSeats +
                ", occupied=" + occupied + ")";
    }
}

