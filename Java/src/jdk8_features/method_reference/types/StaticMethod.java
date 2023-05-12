package jdk8_features.method_reference.types;

import java.util.Arrays;
import java.util.List;


/*
Syntax:
ContainingClass::staticMethodName
 */
public class StaticMethod {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("may", "the", "force", "be", "with", "you");

        //we refer to the static method println
        messages.forEach(System.out::println);
    }
}
