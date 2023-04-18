// with ... you can pass any number of parametrs
function findSum(...numbers) {
    let result = 0;
    for (let number of numbers) {
        result += number;
    }
    return result;
}

console.log(findSum());
console.log(findSum(3, 6, 4));
console.log(findSum(12, 5));
console.log(findSum(1, 2, 3, 4, 5, 6));