package task2.functional;

import task2.orderAndProdect.Order;
import task2.orderAndProdect.Product;

import java.util.ArrayList;

public class MethodsImpl implements Methods {
    private ArrayList<Order> orders;
    private ArrayList<Product> products;

    public MethodsImpl() {
    }

    public MethodsImpl(ArrayList<Order> orders, ArrayList<Product> products) {
        this.orders = orders;
        this.products = products;
    }

    @Override
    public void addOrders(Order order) {
        orders.add(order);
    }

    @Override
    public void addProducts(Product product ){
        products.add(product);
    }



    @Override
    public void deleteOrders(Order order) {
        if (orders.remove(order)){
            System.out.println("Заказ был удалён");
        }
    }

    @Override
    public void  deleteProducts(Product product){
        if (products.remove(product)){
            System.out.println("Продукт был удалён");
        }
    }



    @Override
    public void searchOrders(int namOfOrder) {
        boolean check = true;
        for (Order order : orders) {
            if (order.getId() == namOfOrder) {
                System.out.println(order);
                check = false;
            }
        }
        if (check) {
            System.out.println("Такого заказа нету.");
        }
    }

    @Override
    public void searchProducts(int namOfProducts) {
        boolean check = true;
        for (Product product : products) {
            if (product.getId() == namOfProducts) {
                System.out.println(product);
                check = false;
            }
        }
        if (check) {
            System.out.println("Такого продукта нету.");
        }
    }



    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
