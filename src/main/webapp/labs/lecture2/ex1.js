/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
console.log("in ex1.js");
function sayHello(name) {
    console.log("Hello " + name);
    document.write("Hello " + name);
    alert("Hello " + name);
}

function method1() {
//    document.write("in method 1");
    document.getElementById("text").innerHTML = "method 1";
}

function scope1() {
    global1 = "global1";
    var global2 = "global2";
}
function scope2() {
    console.log("global1="+global1);
    console.log("global2="+global2);
}
sayHello("Jeffrey");

console.log();


