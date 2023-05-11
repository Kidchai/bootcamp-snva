package collections.iterable.collection.queue;

import java.util.PriorityQueue;
// Orders its elements according to their natural ordering
// The head of this queue is the least element
// We can’t create a PriorityQueue of Objects that are non-comparable
public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); //default initial capacity (11)

        //O(log(n)) time for the enqueuing and dequeue methods (offer, poll, remove, add)
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.offer(4); // same as add()

        System.out.println(priorityQueue);
        System.out.printf("Size: %d\n", priorityQueue.size());
        System.out.printf("Head: %d\n", priorityQueue.peek()); // returns the element at the head
        System.out.printf("Head: %d\n", priorityQueue.poll()); // removes the element at the head
        priorityQueue.remove(4); // removes the element
        System.out.println(priorityQueue);
    }
}
