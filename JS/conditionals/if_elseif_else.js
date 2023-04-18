var accountType = promt("Enter type of your account");

if (accountType === "Savings") {
    console.log("This is savings account");
    document.write("This is savings account");
} else if (accountType === "Checking") {
    console.log("This is checking account");
    document.write("This is checking account");
} else {
    console.log("This is account of unknown type");
    document.write("This is account of unknown type");
}