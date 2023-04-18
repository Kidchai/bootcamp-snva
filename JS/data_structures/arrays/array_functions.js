const numbers = [1, 2, 4, 5, 6];
console.log(`This is starting array: ${numbers}`);

//Remove the last element of array
numbers.pop();
console.log(`This is array after .pop() method:      ${numbers}`);

//Add the new element to the end of array
numbers.push(9);
console.log(`This is array after .push(9) method:    ${numbers}`);

//Remove the first element of array
numbers.shift();
console.log(`This is array after .shift method:      ${numbers}`);

//Add the new element to the start of array
numbers.unshift(8);
console.log(`This is array after .unshift(8) method: ${numbers}`);

//Delete the element by its index
delete numbers[3];
console.log(`This is array after delete method:      ${numbers}`);

//Iterating through array with for loop
for (let i = 0; i < numbers.length; i++) {
    console.log(numbers[i]);
}

console.log();

//Iterating through array with forEach
numbers.forEach(element => {
    console.log(element);
});