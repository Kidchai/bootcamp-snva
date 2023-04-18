//var can be re declared

var x =100;
console.log("x value",x);

var x=200;
console.log("x value",x);

// value can be changed

//var is not local scope
{
var x=300;
console.log("x value",x);

}

console.log("x value",x);
