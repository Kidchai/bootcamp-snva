package jdk8_features;

// Functional Interface is an interface with only one abstract method
// It can have any number of default or static methods
// It can also declare methods of object class
// Functional Interface can't be extended by another interface and can't extend another interface
public class FunctionalInterfaceDemo implements Drawable {
    public static void main(String[] args) {
        FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo();
        demo.draw();
    }

    @Override
    public void draw() {
        System.out.println("Drawing...");
    }
}

@FunctionalInterface
interface Drawable {
    void draw();
}
