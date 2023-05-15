package jdk8_features.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, Integer::sum);
        /*
        0 - Identity (element that is the initial value of the reduction operation and the default result if the stream is empty)
        Integer::sum - Accumulator (a function for combining two values)
         */

        System.out.println(result); // 21

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String line = letters
                .stream()
                .reduce("", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());

        System.out.println(line); // ABCDE
    }
}
