//not-arrow fucntion
function findSum(a, b) {
    return a + b;
}
console.log(`Traditional function: 10 + 5 = ${findSum(10, 5)}`);

//arrow fucntion (lambda in Java)
let sum = (a, b) => a + b;
console.log(`Arrow function: 10 + 5 = ${sum(10, 5)}`);