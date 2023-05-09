package collections;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println(stack);
        System.out.printf("Element at the top: %s\n", stack.peek()); // returns the element at the top
        System.out.printf("Element at the top: %s\n", stack.pop()); // removes the element at the top
        System.out.println(stack);
    }
}
