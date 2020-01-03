//var date = new Date();

// console.log(date.getDate());
// console.log(date.getMonth() +1);
// console.log(date.getFullYear());
// console.log(date.getHours());
// console.log(date.getMinutes());
// console.log(date.getMilliseconds());

let myDateTag = document.getElementById('todaysDate');

setInterval(() => {
    let date = new Date();
    myDateTag.innerHTML = <h1>
    
    Date ::: ${date.getDate()}-${date.getMonth() +1}-${date.getFullYear()}
    Time ::: ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}
    </h1>
}, 1);