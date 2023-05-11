package collections.iterable.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Jeans", 33.42);
        Product product2 = new Product(2, "Shirt", 23.99);

        List<Product> arrayList = new ArrayList<>();
        arrayList.add(product1);
        arrayList.add(product2);

        for (Product product : arrayList) {
            System.out.printf("Id: %d Name: %s Price: %.2f\n", product.getId(), product.getName(), product.getPrice());
        }

        System.out.println("====================================");

        LinkedList<Product> linkedList = new LinkedList<>();
        linkedList.add(product1);
        linkedList.add(product2);

        for (Product product : linkedList) {
            System.out.printf("Id: %d Name: %s Price: %.2f\n", product.getId(), product.getName(), product.getPrice());
        }
    }
}

class Product {
    private final int id;
    private final String name;
    private final double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
