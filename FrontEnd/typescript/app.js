"use strict";
console.log('Typescript code started');
var a = 100; //implicitly considered as let a: number
a = null;
//a='string';error cannot reassign type number to string
var b; //implicitly considered as any type
b = 100;
b = 'raj';
console.log(b);
var marks = [1, 2, 3, 4, 5];
var student;
student = {
    name: 'XYZ',
    age: 35,
    pass: true
};
var Sample = /** @class */ (function () {
    function Sample() {
        this.a = 100;
        this.b = 'abc';
    }
    return Sample;
}());
var sample1 = new Sample();
console.log(sample1.a);
console.log(sample1.b);
var Student = /** @class */ (function () {
    function Student(name, age, Usn, marks) {
        this.name = name;
        this.age = age;
        this.Usn = Usn;
        this.marks = marks;
    }
    Student.prototype.printDetails = function () {
        console.log("\n          Name is " + this.name + ",\n          age is " + this.age + ",\n          usn is " + this.Usn + ",\n          marks is " + this.marks + "\n          ");
    };
    return Student;
}());
var student1 = new Student('raj', 56, 'qwert123', 105);
console.log('student name is', student1.name);
console.log(student1.printDetails);
console.log('Typescript code ended');
