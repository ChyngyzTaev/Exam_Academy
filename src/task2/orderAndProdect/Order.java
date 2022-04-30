package task2.orderAndProdect;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
    int id;
    LocalDate date;
    LocalTime time;
    String groceryList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(String groceryList) {
        this.groceryList = groceryList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", groceryList='" + groceryList + '\'' +
                '}';
    }
}
