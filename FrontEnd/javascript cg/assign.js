let marks = [20,20,20,30,40,40,50,60,70,70];
console.log(marks);
let filteresArray = marks.filter((value,index,array)=>
{
   return array.indexOf(value)===index;
   


       
});

console.log(filteresArray.length);



let myArray = marks.map((value,index,array) => {
    return { ind: index, val: value};
});

console.log(myArray);