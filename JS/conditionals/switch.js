const readLine = require('readline');

const rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.question('Enter the product price ', (proPrice) => {
    proPrice = parseInt(proPrice);
    let discount;
    switch (proPrice) {
        case 10000:
            discount = proPrice * 15 / 100;
            break;
        case 15000:
            discount = proPrice * 20 / 100;
            break;
        case 25000:
            discount = proPrice * 23 / 100;
            break;
        default:
            discount = proPrice * 10 / 100;
            break;
    }
    console.log("Discount is " + discount);
});