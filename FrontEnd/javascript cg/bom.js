//getting the current location
navigator.geolocation.getCurrentPosition((position) => {

console.log('latitude',position.coords.latitude);
latitude = position.coords.latitude;
console.log('longitude',position.coords.longitude);
 longitude = position.coords.longitude;
});


let heading = document.getElementById('heading');

heading.style.background = 'red';
heading.style.color = 'white';

function acceptProposal() {
    document.getElementById('proposal').src = "https://cdn.pixabay.com/photo/2019/06/06/21/29/love-4256999_960_720.jpg";
}


function rejectProposal() {
    document.getElementById('proposal').src = "https://cdn.pixabay.com/photo/2017/01/09/10/48/heart-1966018__340.png";
}


localStorage.setItem('class','Capgemini Bangalore batch');