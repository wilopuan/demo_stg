
//Definición de un objeto person
var person = new Object();
person.firstName = "John";
person.lastName = "Doe";
person.age = 55;
person.eyeColor = "blue";
//Definición de funciones
person.fullName = 	function() {return this.firstName + " " + this.lastName;}


//Otra forma de definir objetos
var people = {
  firstName: "John",
  lastName : "Doe",
  id       : 5566,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};


var time = new Date();
//console.log("Esta es la hora del sistema: "+time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());

let d = new Date();
document.body.innerHTML = "Time right now is:  " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();

document.body.innerHTML += "<br>"+person.firstName;

//Copia de objeto
var person2=person;
person2.firstName = "Wilson";
document.body.innerHTML += "<br>"+person2.firstName;
document.body.innerHTML += "<br>"+person.fullName();
document.body.innerHTML += "<br>"+people.fullName();
document.body.innerHTML += "<br>"+people.firstName;

//MEtoodos Built-in toUpperCase();
document.body.innerHTML += "<br>"+people.firstName.toUpperCase();