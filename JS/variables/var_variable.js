var number = 1000;
console.log("number is " + number);

 //duplicate initialization is allowed
var number = 743;
console.log("number is " + number);

//update the value
number = 999;
console.log("number is " + number);

//this block is for local variables
{
    var number = 5000;
    console.log("number is " + number);
}

//but 'var' creates only global variables, so we have access to the 5000 value
console.log("number is " + number);