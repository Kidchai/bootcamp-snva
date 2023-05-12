## Method Reference

You use lambda expressions to create anonymous methods. Sometimes, however, a lambda expression does nothing but 
call an existing method. In those cases, it's often clearer to refer to the existing method by name. 

Method references enable you to do this; they are compact, easy-to-read lambda expressions 
for methods that already have a name.

```java
List<Customer> customers = ...;

// Lambdas

customers.stream()
         .filter(customer -> customer.isActive())
         .map(customer -> customer.getName())
         .map(name -> name.toUpperCase())
         .peek(name -> System.out.println(name))
         .toArray(count -> new String[count]);

// Method References

customers.stream()
         .filter(Customer::isActive)
         .map(Customer::getName)
         .map(String::toUpperCase) 
         .peek(System.out::println)
         .toArray(String[]::new);
```

- Method Reference in java 8 makes the code simple and more readable than lambda expression.
- Method reference refers to the method via the use of an `::` operator.
- A method reference in Java 8 can execute only a single method call like a lambda expression but a shorter code.
- Java 8 allows the method reference to static methods, instance methods, and constructors.