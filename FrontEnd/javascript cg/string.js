let message = 'good morning folks';

//return ascii value of the character at the specified index
console.log(message.charCodeAt(3));

//returns the character in the specified index
console.log(message.charAt(2));

//reversing a string
let splittedMessage = message.split('').reverse().join('');
console.log(splittedMessage);

//to cheack the string for a particular value present in that
console.log(message.includes('good'));//returns boolean


console.log(message.toLowerCase());
console.log(message.toUpperCase());

console.log(message.substr(0, 10));

//to find the length of the String 
console.log(message.length);

function add(...nums) {
    let sum = 0;
    for(let num of nums) {

        sum = sum + num;
    }
    console.log('Sum of the numbers',sum);
}

add(12,23,45,67);

//object destructuring
let student = {
    id: 1234,
    name: 'raj',
    age: 64
};

let {id , name, ...theRest} = student;

console.log(name);
console.log(id);
console.log(theRest);

//array destructuring
let marks = [20,40,60,80,90];

let[maths,science,social,...rest] = marks;

console.log('maths marks',maths);
console.log('science marks',science);
console.log('social marks',social);
console.log('rest of the marks',rest);
