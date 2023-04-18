let balance = 10_000;
let withdrawalAmount = 5000;

if (balance >= withdrawalAmount) {
    let availableBalance = balance - withdrawalAmount;
    console.log("Transaction is successful! Available balance: " + availableBalance);
} else {
    console.log("Insufficient balanc. Available balance: " + balance);
}