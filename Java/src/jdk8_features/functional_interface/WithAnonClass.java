package jdk8_features.functional_interface;
//Part 2

public class WithAnonClass {
    public static void main(String[] args) {

        //we use anonymous class to override a method of interface without creating a class (line 7-12)
        Drawable demo = new Drawable() {
            public void draw() {
                System.out.println("Drawing...");
            }
        };
    }
}

@FunctionalInterface
interface Drawable {
    void draw();
}
