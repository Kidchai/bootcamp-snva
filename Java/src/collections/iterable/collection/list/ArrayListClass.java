package collections.iterable.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.printf("List size: %d\n", list.size());

        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.printf("List size: %d\n", list.size());
        System.out.printf("element at index 1: %s\n", list.get(1));
        System.out.println(list);

        for (String element : list) {
            System.out.println(element);
        }
    }
}
