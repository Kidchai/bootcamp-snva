package jdk8_features.stream;

import java.util.stream.Stream;

public class LimitDemo {
    public static void main(String[] args) {
        Stream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(System.out::println);
    }
}
