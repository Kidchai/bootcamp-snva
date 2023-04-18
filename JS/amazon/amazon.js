function validateForm() {
    let userName = document.forms["loginForm"]["userName"].value;

    if (userName == "") {
        alert("Please, enter your email or mobile phone number.")
    } else if (userName === "admin@gmail.com") {
        document.write("Welcome!");
    } else {
        document.write("Sorry, the username or password is wrong. Please, try again.")
    }
}