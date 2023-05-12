package collections.map;

import java.util.HashMap;
import java.util.Map;

//doesn't provide any guarantee over the way the elements are arranged in the Map
//no duplicate keys
//null key and null values are allowed
public class HashMapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        //constant-time performance for the basic operations (get and put)
        map.put(1, "One");
        map.put(3, "Three");
        map.put(7, "Seven");
        map.put(2, "Two");
        map.put(20, "Twenty");
        map.put(7, "Seven2");
        map.put(null, "Null");

        System.out.printf("Map size: %d\n", map.size());
        System.out.println(map);
    }
}
