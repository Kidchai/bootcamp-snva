package collections;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Two");
        linkedList.addLast("Three");
        linkedList.addFirst("One");

        System.out.println(linkedList);
        System.out.printf("First element: %s\n", linkedList.getFirst());
        System.out.printf("First element: %s\n", linkedList.element()); // same as getFirst()
        System.out.printf("Element with index 1: %s\n", linkedList.get(1));
        System.out.printf("Last element: %s\n", linkedList.getLast());

        linkedList.removeFirst();
        linkedList.remove(); // same as removeFirst()
        linkedList.removeLast();

        System.out.println(linkedList);
    }
}
