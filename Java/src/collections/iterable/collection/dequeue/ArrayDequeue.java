package collections.iterable.collection.dequeue;

import java.util.ArrayDeque;

// Likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.
public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("Two"); //add to the end
        arrayDeque.add("Three");

        arrayDeque.addFirst("One");
        arrayDeque.addLast("Four");

        System.out.println(arrayDeque);

        System.out.printf("First element: %s\n", arrayDeque.getFirst());
        System.out.printf("Last element: %s\n", arrayDeque.getLast());

        System.out.printf("First element: %s\n", arrayDeque.peek()); // returns the element at the top
        System.out.printf("First element: %s\n", arrayDeque.peekFirst()); // same as peek()
        System.out.printf("Last element: %s\n", arrayDeque.peekLast());

        System.out.printf("Removed first element: %s\n", arrayDeque.poll());
        System.out.printf("Removed first element: %s\n", arrayDeque.pollFirst()); // same as poll()
        System.out.printf("Removed last element: %s\n", arrayDeque.pollLast());

        System.out.println(arrayDeque);
    }
}
