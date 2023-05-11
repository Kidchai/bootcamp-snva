package collections.iterable.collection.set.sortedSet;

import java.util.TreeSet;

//elements are ordered using their natural ordering, or by a Comparator provided at set creation time
public class TreeSetClass {
    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<>();

        //log(n) time for the basic operations (add, remove and contains).
        treeSet.add(1);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(3);

        System.out.printf("TreeSet size: %d\n", treeSet.size());
        System.out.println(treeSet);

        System.out.printf("First element: %d\n", treeSet.first());
        System.out.printf("Last element: %d\n", treeSet.last());

        System.out.printf("Greatest element < 5: %d\n", treeSet.lower(5));
        System.out.printf("Greatest element <= 5: %d\n", treeSet.floor(5));

        System.out.printf("Least element > 5: %d\n", treeSet.higher(5));
        System.out.printf("Least element >= 5: %d\n", treeSet.ceiling(5));

        System.out.printf("Remove the first (lowest) element: %d\n", treeSet.pollFirst());
        System.out.printf("Remove the last (highest) element: %d\n", treeSet.pollLast());
        System.out.printf("Is element 7 successfully removed: %b\n", treeSet.remove(7));

        System.out.println(treeSet);
    }
}
