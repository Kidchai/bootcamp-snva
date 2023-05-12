package collections.map;

import java.util.Hashtable;

// as HashMap but synchronized
// no null key or values
// no duplicate keys
public class HashTableClass {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();

        // constant-time performance for the basic operations (get and put) but slower than HashMap
        map.put(1, "One");
        map.put(3, "Three");
        map.put(7, "Seven");
        map.put(2, "Two");
        map.put(20, "Twenty");
        map.put(7, "Seven2");

        System.out.printf("Hashtable size: %d\n", map.size());
        System.out.println(map);

        System.out.println(map.getOrDefault(2, "Not found"));
        map.remove(2);
        System.out.println(map.getOrDefault(2, "Not found"));
    }
}
