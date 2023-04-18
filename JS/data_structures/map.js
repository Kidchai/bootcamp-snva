const map = new Map();

map.set("Berlin", "Germany");
map.set("Hamburg", "Germany");
map.set("Penza", "Russia");
map.set("Tokyo", "Japan");
map.set("Rome", "Italy");
map.set("Osaka", "Japan");

console.log(map.size);
console.log(`Berlin it's a ${map.get("Berlin")}`);

for (let[key, value] of map) {
    console.log(`${key}, ${value}`);
}