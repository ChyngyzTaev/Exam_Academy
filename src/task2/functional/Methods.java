package task2.functional;

import task2.orderAndProdect.Order;
import task2.orderAndProdect.Product;

public interface Methods {
    void addOrders(Order order);
    void addProducts(Product product);

    void deleteOrders(Order order);
    void deleteProducts(Product product);

    void searchOrders(int namOfOrder);
    void searchProducts(int namOfProducts);
}
