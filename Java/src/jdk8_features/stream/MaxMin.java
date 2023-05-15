package jdk8_features.stream;

import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(max); // 5

        int min = numbers.stream()
                .min(Integer::compareTo)
                .get();
        System.out.println(min); // 1
    }
}
