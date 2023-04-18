 //duplicate initialization is NOT allowed
 //we CAN'T update the value
 const number = 1000;
 console.log("number is " + number);
 
 //this block is for local variables
 {
     let number = 5000;
     console.log("number is " + number);
 }
 
 //we do not have access to the local variable with value 5000
 console.log("number is " + number);