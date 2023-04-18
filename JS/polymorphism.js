class Parent {
    display() {
        console.log("This is a method from the Parent class")
    }
}

class Child extends Parent {
    //Method overriding
    display() {
        console.log("This is a method from the Child class")
    }
}

let childObject = new Child;
childObject.display();