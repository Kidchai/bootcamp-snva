package jdk8_features;

import java.util.Optional;

// Optional is a container object which may or may not contain a non-null value.
public class OptionalClass {
    public static void main(String[] args) {
        // Optional.ofNullable() returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.
        // Optional.of() returns an Optional describing the specified value, if non-null, otherwise throws NullPointerException.
        // Optional.empty() returns an empty Optional instance.
        // Optional.isPresent() returns true if there is a value present, otherwise false.
        // Optional.get() returns the value if present, otherwise throws NoSuchElementException.
        // Optional.ifPresent() performs the given action if a value is present, otherwise does nothing.
        // Optional.orElse() returns the value if present, otherwise returns other.
        // Optional.orElseGet() returns the value if present, otherwise invokes other and returns the result of that invocation.
        // Optional.orElseThrow() returns the contained value, if present, otherwise throws an exception to be created by the provided supplier.

        //example 1
        String[] words = new String[10];
        words[5] = "Java";
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            System.out.println("The word is present");
        } else {
            System.out.println("Word is null");
        }

        checkNull.ifPresent(System.out::println);

        //example 2
        String[] words2 = new String[10];
        words2[5] = "Java";
        Optional<String> checkNull3 = Optional.ofNullable(words2[5]);
        System.out.println(checkNull3.orElse("word is null"));

        //example 3
        String[] words3 = new String[10];
        words3[5] = "Java";
        Optional<String> checkNull4 = Optional.ofNullable(words3[5]);
        System.out.println(checkNull4.orElseGet(() -> "word is null"));

        //example 4
        String[] words4 = new String[10];
        words4[5] = "Java";
        Optional<String> checkNull5 = Optional.ofNullable(words4[5]);
        try {
            System.out.println(checkNull5.orElseThrow(Exception::new));
        } catch (Exception e) {
            System.out.println("word is null");
        }
    }
}
