//we can pass the function as a parameter into another function
function calculate(number1, number2, function1, function2) {
    let sum = number1 + number2;
    const result = function1(sum);
    function2(result);
}

function printResult(result) {
    console.log(`Result is ${result}`);
}

function multiplyByTwo(number) {
    return number * 2;
}

calculate(20, 35, multiplyByTwo, printResult);