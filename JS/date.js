const now = new Date();
console.log(now);
console.log(now.getDate());
console.log(now.getMonth());
console.log(now.getFullYear());
console.log(now.getHours());
console.log(now.getMinutes());
console.log(now.getSeconds());

const birthday = new Date("April 16, 2002");
console.log(birthday);
console.log(birthday.toLocaleDateString());
console.log(birthday.toLocaleString());

//Change date
birthday.setDate(14);
birthday.setMonth(9);
birthday.setFullYear(2000);
console.log(birthday.toLocaleDateString());