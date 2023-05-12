package collections.map.sortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

// as HashMap but maintains ascending order
// no null key
public class TreeMapClass {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();

        // log(n) time performance for the basic operations (get and put)
        map.put(1, "One");
        map.put(3, "Three");
        map.put(7, "Seven");
        map.put(2, "Two");
        map.put(7, "Seven2");

        System.out.printf("TreeMap size: %d\n", map.size());
        System.out.println(map);
    }
}
