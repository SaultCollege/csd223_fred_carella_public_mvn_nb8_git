function load(){
    console.log("load");
    setInterval(function(){ 
        console.log("Hello"); 
        document.getElementById("body").style.backgroundImage= "none";
    }, 1000);
    
}       
