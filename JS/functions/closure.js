function outerFunction() {
    const outerVariable = "I'm a variable from the outer function";
    function innerFunction() {
        console.log(outerVariable);
    }
    return innerFunction;
}

const method = outerFunction();
method();