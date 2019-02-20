function main() {
// declaring and initializing

// array literals
    var name = ["john", "paul", "george", "ringo"];
    var newsSections = ["world", "local", "opinion", "sports"];
    newsSections[4] = "entertainment";

    var sec1Head = document.getElementById("section1");
    var sec2Head = document.getElementById("section2");
    var sec3Head = document.getElementById("section3");
    var preamble = document.getElementById("preamble");
    sec1Head.innerHTML = "newsSections[0] = " + newsSections[0]; // "world"
    sec2Head.innerHTML = "newsSections[1] = " + newsSections[1]; // "local"
    sec3Head.innerHTML = "newsSections[2] = " + newsSections[2]; // "opinion"
    preamble.innerHTML = "There are " + newsSections.length + " news sections";

// array objects
// literals are preferred
    var newsSectionsAsObjects = new Array(6);

// get an array of elements programatically
    var secondLiElement = document.getElementsByTagName("li")[2];
    secondLiElement.innerHTML = "newsSections[2] = " + newsSections[2];

// loop thru array of elements programatically

// while loop
    var liElements = document.getElementsByTagName("li");

    var i = 0;
    while (i < newsSections.length) {
        liElements[i].innerHTML = newsSections[i];
        i++;
    }

    var liElements2=document.querySelectorAll('li.for_loop');
    for (var count = 0; count < newsSections.length; count++) {
        liElements2[count].innerHTML = count+". "+newsSections[count];
    }

    liElements2[100].innerHTML = "X";

}


