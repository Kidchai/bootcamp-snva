function Person(userName, age) {
    this.userName = userName;
    this.age = age;
}

// Person.prototype.city = "Texas";

Person.prototype.greet = () => console.log(`Hi, ${userName}! You're ${age} years old`);

const obj = new Person("Anna", 27);
obj.greet();
// console.log(obj.city);