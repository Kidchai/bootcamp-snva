package collections.map;

import java.util.LinkedHashMap;

// as HashMap but maintains insertion order
public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // constant-time performance for the basic operations (get and put)
        map.put(1, "One");
        map.put(3, "Three");
        map.put(7, "Seven");
        map.put(2, "Two");
        map.put(7, "Seven2");
        map.put(null, "Null");

        System.out.printf("LinkedHashMap size: %d\n", map.size());
        System.out.println(map);
    }
}
