package inheritance;

//The child class is created from another child class.
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.printGrandParent();
        child.printParent();
        child.printChild();
    }
}

class GrandParent {
    public void printGrandParent() {
        System.out.println("This is the method from the GrandParent class");
    }
}

class Parent extends GrandParent {
    public void printParent() {
        System.out.println("This is the method from the Parent class");
    }
}

class Child extends Parent {
    public void printChild() {
        System.out.println("This is the method from the Child class");
    }
}
