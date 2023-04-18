//var can't be re declared

let x =100;
console.log("x value",x);

// var x=200;
x=900;
console.log("x value",x);

// value can be changed

//var is not local scope
{
let x=300;
console.log("x value",x);

}

console.log("x value",x);
