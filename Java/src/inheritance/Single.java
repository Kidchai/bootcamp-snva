package inheritance;

//Only one parent and only one child
public class Single {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.showParent();
        childClass.showInfo();
    }
}

class ParentClass {
    int productId = 1;
    String productName = "Bicycle";
    int productPrice = 500;

    public void showParent() {
        System.out.println("This is the method from the parent class");
    }

    public void showInfo() {
        System.out.printf("This is the parent method. Product id: %d, name: %s price: %d\n", productId, productName, productPrice);
    }
}

class ChildClass extends ParentClass {

    public void showInfo() {
        System.out.printf("This is the child method. Product id is %d  name is %s price is %d\n", productId, productName, productPrice);
    }
}
