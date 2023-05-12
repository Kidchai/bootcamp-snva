package jdk8_features.functional_interface.anonymous_class;

public class WithoutAnonClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();

        //we want to override speak() method of Animal class, so we created a Dog class which extends Animal class
        //and override speak() method in a Dog class
        Dog dog = new Dog();
        dog.speak();

        //But what if we want to override speak() method of Animal class without creating a Dog class?
    }
}

class Animal {
    void speak() {
        System.out.println("makes sound...");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("barks...");
    }
}
