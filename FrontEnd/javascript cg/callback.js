//setTimeout
console.log('javascript started');


setTimeout(function(){
    console.log('10 seconds done');

},10000);

console.log('javascript ended');




//setInterval
console.log('javascript started');

var i=0;

setInterval(function(){
    console.log(1);
    i++;
    console.log('1 seconds done');

},1000

);

console.log('javascript ended');


//fat arrow function
var test = (a,b) => {
    console.log(a*b);
}
test(12,23);

//another way of fat arrow function
var test = (a,b) => a*b;
console.log(test(12,23));

var demo = a => a*5;
console.log(demo(12));

//var keyword
if(true) {
    var a = 100;
}
console.log(a);

//let keyword
