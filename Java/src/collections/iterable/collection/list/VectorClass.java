package collections.iterable.collection.list;

import java.util.Vector;

//as ArrayList but synchronized
public class VectorClass {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        System.out.printf("Vector size: %d\n", vector.size());
        System.out.println(vector);
        System.out.printf("Element at index 1: %s\n", vector.get(1));
        System.out.printf("Element at index 1: %s\n", vector.elementAt(1)); // same as get()
        System.out.printf("First element: %s\n", vector.firstElement());
        System.out.printf("Last element: %s\n", vector.lastElement());

        vector.remove(0);
        vector.remove("Two");
        vector.removeElementAt(0);

        System.out.println(vector);
    }
}
