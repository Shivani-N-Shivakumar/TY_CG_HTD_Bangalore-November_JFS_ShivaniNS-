let marks = [12,45,54,23,34,67,53,78,90,63];

let ascendingOrderOfMarks = marks.sort((a,b)=>{
    return a-b;
});

console.log('in ascending order' ,ascendingOrderOfMarks);


let descendingOrderOfMarks = marks.sort((a,b)=>{
    return b-a;
});

console.log('in descending order' ,descendingOrderOfMarks);
