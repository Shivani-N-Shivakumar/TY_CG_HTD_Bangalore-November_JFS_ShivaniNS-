var technologies = ['java', 'spring','hybernate','angular',1234,true,null];

//console.log(technologies[6]);




for( let technology of technologies) {
    console.log(technology);
}

for (let index in technologies) {
    console.log('index is' +index+ 'value is '+technologies[index]);
}


//for each loop7
technologies .forEach ((value),index)  => {
    console.log(value);
    console.log(index);
});


console.log('index of angular is ' +technologies.indexOf('angular'));

console.log('before pop' +technologies);

console.log(technologies.pop()); //returns value in the last index and removes it

console.log('After pop' +technologies) ;

console.pop('before pushing a element',technologies);

console.log(technologies.push('spring boot','spring rest'));
// adds the elements and returns the length

console.pop('after pushing a element',technologies);


console.log('before shift',technologies);

console.log(technologies.shift());
//returns value in the index 0 and removes it
console.log('after shift',technologies);



//unshift
console.log('before unshift',technologies);
console.log(technologies.unshift('HTML','CSS'));
console.log('after unshift',technologies);

//splice
technologies.splice(2,0,'Bootstrap','javascript','java');
console.log('slice applied to add few elements',technologies);
technologies.splice(technologies.indexOf(1234),2);
console.log('after deleting unwanted elements',technologies);

//to find the length of the array
console.log(technologies.length);

//to reverse the array
technologies.reverse();

console.log('reversed array',technologies);


let marks = [12,30,45,60,90,11,34,67,86];

console.log(marks);

let filteredArray = marks.filter((value,index,array)=>{
    return value > 40;
});

//no. of people having marks greater than 40
console.log(filteredArray.length);