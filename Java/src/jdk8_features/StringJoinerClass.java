package jdk8_features;

import java.util.StringJoiner;

// It can be used for joining Strings making use of a delimiter, prefix, and suffix
public class StringJoinerClass {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("John")
                .add("Jack")
                .add("Jill");
        System.out.println(joiner); // [John, Jack, Jill]
    }
}
