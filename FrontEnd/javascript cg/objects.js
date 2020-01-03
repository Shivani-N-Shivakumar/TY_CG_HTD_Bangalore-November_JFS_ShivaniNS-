var person = {
    aadharNo: 123456789876
}

var personPan = {
    pan:23456543
}

var student = {
    ...person,
    ...personPan,
    id: 1234,
    name: 'suraj khan',
    degree: 'BE fail',
    phone: 98765432,
    address: {
        city:'banglore',
        state:'karnataka',
        pincode: 560097
    }
}


for(let key in student) {
    console.log(key + ':::' + student[key])
}
console.log(student.address.city);
console.log(student);
console.log(student.aadharNo);
console.log(student.name);
console.log(student['degree']);