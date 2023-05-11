package collections.iterable.collection.set;

import java.util.HashSet;
import java.util.Set;

//use hash function to store elements
//no duplicates
public class HashSetClass {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Three");
        set.add("One");
        set.add(null);
        set.add("Four");
        set.add("Five");

        System.out.printf("Set size: %d\n", set.size());
        System.out.println(set);
        set.remove("One");
        System.out.printf("Set contains \"One\": %b\n", set.contains("One"));
    }
}
