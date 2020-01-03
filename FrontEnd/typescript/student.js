"use strict";
var Stud = /** @class */ (function () {
    function Stud(name, age, Usn, marks, aadharNo, panNo) {
        this.name = name;
        this.age = age;
        this.Usn = Usn;
        this.marks = marks;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
    }
    return Stud;
}());
var stud1 = {
    name: 'Suraj khan',
    age: 45,
    Usn: 'qwer321',
    marks: 15
};
var stud2 = new Student('saif', 30, 'ABC123', 12);
var clearedStudents = [
    new Student('shivani', 23, 'cg49', 76),
    new Student('sharman', 23, 'cg89', 98)
];
console.log(clearedStudents);
