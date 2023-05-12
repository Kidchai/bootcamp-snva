## Lambda Expressions

It’s a way to represent the anonymous function. It allows us to pass behavior as a parameter to the method.

### Syntax
`(argument-list) -> {body}`

### Example

We have the following functional interface `Operator`. It has one method `process()` that takes two 
parameters and returns a value.

```java
@FunctionalInterface
interface Operator<T> {
    T process(T a, T b);
}
```

We can create lambda expressions for this functional interface in the following manner.
Notice we are able to create the method implementations and immediately use them. 
**We do not need to create a concrete class** `OperatorImpl` that implements `Operator` interface.

```java
Operator<Integer> addOperation = (a, b) ->  a + b;
System.out.println(addOperation.process(3, 3));     //Prints 6

Operator<String> appendOperation = (a, b) ->  a + b;
System.out.println(appendOperation.process("3", "3"));  //Prints 33

Operator<Integer> multiplyOperation = (a, b) ->  a * b;
System.out.println(multiplyOperation.process(3, 3));    //Prints 9
```