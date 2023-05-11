package collections.iterable.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

//as HashSet but maintains insertion order
public class LinkedHashSetClass {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Three");
        set.add("One");
        set.add(null);
        set.add("Four");
        set.add("Five");

        System.out.printf("LinkedHashSet size: %d\n", set.size());
        System.out.println(set);
        set.remove("One");
        System.out.printf("LinkedHashSet contains \"One\": %b\n", set.contains("One"));
    }
}
