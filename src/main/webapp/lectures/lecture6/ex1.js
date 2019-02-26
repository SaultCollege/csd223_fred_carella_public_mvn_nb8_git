console.log("in ex1.js");
function validateForm() {
    var fname = document.getElementbyId("firstname");
    if (fname.valueMissing) {
        setCustomValidity("Please fill out this field.");
    }
}


function createEventListeners() {
    var form = document.getElementsByTagName("form")[0];
    if (form.addEventListener) {
        form.addEventListener("submit", validateForm, false);
    } else if (form.attachEvent) {
        form.attachEvent("onsubmit", validateForm);
    }
}

function setUpPage() {
    createEventListeners();
}
/* run setup functions when page finishes loading */
if (window.addEventListener) {
    window.addEventListener("load", setUpPage, false);
} else if (window.attachEvent) {
    window.attachEvent("onload", setUpPage);
}