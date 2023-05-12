package jdk8_features.functional_interface.anonymous_class;

public class WithAnonClass {
    public static void main(String[] args) {

        //we use anonymous class to override a method of a class without creating a subclass (line 7-12)
        AnimalClass animal = new AnimalClass() { //anonymous class extends AnimalClass
            @Override
            void speak() {
                System.out.println("barks...");
            }
        };
        animal.speak();
    }
}

class AnimalClass {
    void speak() {
        System.out.println("makes sound...");
    }
}
