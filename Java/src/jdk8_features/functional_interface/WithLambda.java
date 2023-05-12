package jdk8_features.functional_interface;
//Part 3

public class WithLambda {
    public static void main(String[] args) {
        //without anonymous class, we can override draw() method of DrawableInterface by using lambda expression
        Drawable1 demo = () -> {
            System.out.println("Drawing...");
        };
        demo.draw();
    }
}

@FunctionalInterface
interface Drawable1 {
    void draw();
}