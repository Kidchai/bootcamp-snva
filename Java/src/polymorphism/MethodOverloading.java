package polymorphism;

public class MethodOverloading {

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        shape.draw("green");
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void draw(String color) {
        System.out.println("Drawing a shape with color " + color);
    }
}
