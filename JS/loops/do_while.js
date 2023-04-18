const readLine = require('readline');
const rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.question("Please, enter your name: ", function(name) {
    rl.question("Please, enter your hourly rate: ", function(hourlyRate) {
        rl.question("Please, enter the number of your working hours: ", function(hoursWorked) {
            hourlyRate = Number(hourlyRate);
            hoursWorked = Number(hoursWorked);

            const grossPayment = hourlyRate * hoursWorked;

            const taxRate = 0.1 //10% tax
            const taxAmount = grossPayment * taxRate;
            const netPay = grossPayment - taxAmount;

            const payslip = 
            Name: ${name}
            Hours Worked: ${hoursWorked}
            Hourly Rate: $${hourlyRate.toFixed(2)}
            Gross Pay: $${grossPayment.toFixed(2)}
            Tax: $${taxAmount.toFixed(2)}
            Net Pay: $${netPay.toFixed(2)}
        }
    })
}

do {
    let i = 0;
    const rl = readLine.createInterface({
        input: process.stdin,
        output: process.stdout
    })

} while (i < )