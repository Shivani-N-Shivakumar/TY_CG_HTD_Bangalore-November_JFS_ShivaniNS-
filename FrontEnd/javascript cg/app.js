//console.log('hi from external js');

//vrriable declaration
var a;

//variable initialization
a=100;

console.log('value of a is' + a);

console.log(typeof a);

var name = "Rajasekhar";
console.log(name);
console.log(typeof name);

var age = 67;

//using template literals with embedded expressions
var details = `The name is ${name} and age is ${age}`;
console.log(details);

console.log(`The sum of 10 and 11 is ${10 + 11}`);

//having 
var sampleText = `Lorem ipsum dolor sit , amet consectetur adipisicing elit.`;
console.log(sampleText);

var icompassCleared = true;
console.log(typeof icompassCleared);

var empty = null;
console.log(typeof empty);

if(true === 'true') {
    console.log('true block');
}else{
    console.log('false block');
}

if(null == undefined) {
    console.log('true block');
}else{
    console.log('false block');
}

//alert('Are you fine');

 var userConfirmation = confirm('are you sure want to proceed');
 console.log(userConfirmation);

 if(userConfirmation) {
     console.log('the user selected ok');

 }else{
     console.log('user cancelled the operation');
 }

 var userInput = prompt('please enter your name');
 console.log(userInput);

 document.write('welcome to javascript');    


 //functions
 //naming function

 var a = 'xyz';

 function demo() {
     console.log(a);
     var b = 100;
     console.log('function demo is being called');
 }
 //console.log(b); 
 //throws error b is not defined
 //it is a local scoped variable

 demo();

 function add(a,b) {
     return a+b;
 }

 console.log(add(1,2));

 var test = function(){
     console.log('anonymous function assigned to variable test');
 }

 test();

 (function demo1(){
     var name = 'raj';
     console.log(a+b);
     console.log('inside the function',name);
     console.log('IIFE Running');
 })(12,23);
 console.log('outside function',name);

 function sample(k) {
     console.log('sample function started');
     k();
     console.log('sample function ended');
 }

 sample(function(){
     console.log('callback function running');
 });

 