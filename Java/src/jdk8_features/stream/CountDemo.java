package jdk8_features.stream;

import java.util.stream.Stream;

// Returns the count of elements in the stream. This is a special case of a reduction
public class CountDemo {
    public static void main(String[] args) {
        long count = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .count();
        System.out.println(count); // 10
    }
}
