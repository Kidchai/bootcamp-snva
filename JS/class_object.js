class Person {
    constructor(name, age, city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    display() {
        console.log(`Name: ${this.name}`);
        console.log(`Age: ${this.age}`);
        console.log(`City: ${this.city}`);
    }
}

let person1 = new Person("Kate", 22, "Tver");
let person2 = new Person("Peter", 28, "Kazan");

person1.display();
person2.display();