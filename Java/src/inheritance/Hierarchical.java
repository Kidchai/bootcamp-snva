package inheritance;

//One parent and many children
public class Hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();

        Cat cat = new Cat();
        cat.speak();
    }
}

class Animal {
    public void eat() {
        System.out.println("I'm an animal");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Bow wow!");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("Meow!");
    }
}
