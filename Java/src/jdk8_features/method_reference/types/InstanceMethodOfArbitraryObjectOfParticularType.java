package jdk8_features.method_reference.types;

import java.util.Arrays;
import java.util.List;

/*
Syntax:
ContainingType::methodName
 */

//similar to the Reference to an instance method of a particular object
//but without having to create a custom object to perform the comparison
public class InstanceMethodOfArbitraryObjectOfParticularType {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);

        //using lambda expression
        numbers.stream()
                .sorted((a, b) -> a.compareTo(b));

        //using method reference
        numbers.stream()
                .sorted(Integer::compareTo);
    }
}
