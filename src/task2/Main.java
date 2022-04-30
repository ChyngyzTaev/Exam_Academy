package task2;

import task2.functional.MethodsImpl;
import task2.list.Types;
import task2.orderAndProdect.Order;
import task2.orderAndProdect.Product;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        Product product = new Product();
        Types types;
        MethodsImpl methodsImpl = new MethodsImpl();

        MethodsImpl methods = new MethodsImpl();
        System.out.println("Функционал:\n" +
                "1. Добовление заказов: \n" +
                "2. Добовление продуктов: \n" +
                "3. Удаление заказов : \n" +
                "4. удаление продуктов: \n" +
                "5. Поиск заказов: \n" +
                "6. Поиск продуктов: \n");
        int point;
        point = sc.nextInt();

        switch (point) {
            case 1:
                order.setId(1);
                order.setDate(LocalDate.now());
                order.setTime(LocalTime.now());
                order.setGroceryList("1" +
                        "2" +
                        "3");
                methods.addOrders(order);
                break;

            case 2:
                product.setId(1);
                product.setName(String.valueOf(Types.Milky));
                product.setName(String.valueOf(Types.Meet));
                product.setName(String.valueOf(Types.Bread));
                product.setName(String.valueOf(Types.Cereals));
                product.setTypeProduct("Молочный");
                product.setTypeProduct("Мясной");
                product.setTypeProduct("Хлебный");
                product.setTypeProduct("-");
                methods.addProducts(product);
                break;

            case 3:
                methodsImpl.deleteOrders(order);
                break;

            case 4:
                methodsImpl.deleteProducts(product);
                break;
        }
    }
}
