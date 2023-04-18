//JSON - JavaScript Object Notation
const Person = {
    name: "Maria",
    age: 27,
    hobbies: ["reading", "hiking"],
    address: {
        street: "12 Avenue Str",
        city: "Oak Park",
        state: "Illinois"
    },
    sayHello: function() {
        console.log(`Hello! My name is ${this.name}`)
    }
};

console.log(Person.name);
console.log(Person.hobbies[1]);
console.log(Person.address.city);
console.log(Person.sayHello());