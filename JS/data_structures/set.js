//For storage unique elements
const days = new Set();

days.add("Sunday");
days.add("Monday");
days.add("Tuesday");
days.add("Tuesday");
days.add("Wednsday");
days.add("Thursday");
days.add("Friday");
days.add("Saturday");
days.add("Sunday");

console.log(days.size);
console.log(days);

console.log(days.has("Sunday"));
console.log("After deleting Monday");
days.delete("Monday");
console.log(days);

for (let day of days) {
    console.log(day);
}