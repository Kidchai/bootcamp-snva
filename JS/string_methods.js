const str = "Hello, World!";

//Print the element by its index
console.log(str.charAt(3));

const line1 = "Today is ";
const line2 = "a good day";
//Concatenate strings
const line3 = line1.concat(line2);
console.log(line3);

//Check if the string contains it
console.log(str.includes("World"));

//Return the starting index of the element
console.log(str.indexOf("World"));

//Return the cutted string
console.log(str.slice(0, 5));

console.log(str.toLowerCase());
console.log(str.toUpperCase());