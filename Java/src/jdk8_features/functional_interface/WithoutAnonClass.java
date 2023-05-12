package jdk8_features.functional_interface;
//Part 1
public class WithoutAnonClass {

    //we want to override draw() method of DrawableInterface, so we created a Drawer class which implements DrawableInterface
    //and override draw() method in a Drawer class
    public static void main(String[] args) {
        Drawer drawer = new Drawer();
        drawer.draw();
    }

    //But what if we want to override draw() method of DrawableInterface without creating a Drawer class?
}

interface DrawableInterface {
    void draw();
}

class Drawer implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing...");
    }
}
