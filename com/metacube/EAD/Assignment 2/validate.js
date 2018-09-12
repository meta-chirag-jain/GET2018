function color(isValid, objectName) {
    isValid ? objectName.style.border = "" : objectName.style.border = "1px solid red";
}

function validateFirstName() {
    var firstName = document.getElementById("firstName");
	var isValid = /^[a-zA-Z ]{2,}$/.test(firstName.value);
	color(isValid, firstName);
    return isValid;
}

function validateLastName() {
    var lastName = document.getElementById("lastName");
	var isValid = /^[a-zA-Z]{2,}$/.test(lastName.value);
	color(isValid, lastName);
    return isValid;
}

function validateEmail() {
    var email = document.getElementById("email");
	var isValid = /[a-zA-Z0-9]+@+[A-Za-z]+.+\S$/.test(email.value);
	color(isValid, email);         
    return isValid;
}

function validatePassword() {
    var password = document.getElementById("password");
    var isValid = /[a-z]+/.test(password.value) && /[A-Z]+/.test(password.value) && /[0-9]+/.test(password.value) && /[^a-zA-Z0-9]+/.test(password.value) && password.value.length>=8;
    color(isValid, password);
    return isValid;
}

function validateConfirmPassword() {
    var password = document.getElementById("password");
    var confirmPassword = document.getElementById("confirmPassword");
    var isValid=false;
    if(password.value == confirmPassword.value) {
        isValid=true;
    }
    color(isValid, confirmPassword);
    return isValid;
}

function validateNumber() {
    var number = document.getElementById("contactNumber");
	var isValid = /^[0-9]{8,}$/.test(number.value);
	color(isValid, number);
    return isValid;
}

function validateForm() {
    if(validateFirstName() && validateLastName() && validateEmail() && validatePassword() && validateConfirmPassword() && validateNumber()) {        
        alert("Submitting");
        return true;
    }
    else {
        alert("Wrong Input");
    }
    return false;
}