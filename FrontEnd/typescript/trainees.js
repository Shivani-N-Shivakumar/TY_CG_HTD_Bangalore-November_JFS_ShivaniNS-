"use strict";
var Studen = /** @class */ (function () {
    function Studen(Usn, marks, aadharNo, panNo) {
        this.Usn = Usn;
        this.marks = marks;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
    }
    return Studen;
}());
var Training = /** @class */ (function () {
    function Training() {
        this.name = 'abc';
        this.age = 21;
        this.Usn = 'qw123';
        this.marks = 100;
        this.aadharNo = 123;
        this.panNo = 'qwerty';
    }
    Training.prototype.data = function () {
        console.log('Hello');
    };
    Training.prototype.printData = function () {
        console.log('hi');
    };
    return Training;
}());
var trainee1 = {
    name: 'Raja',
    age: 45,
    printData: function () {
        console.log(this.name, this.age);
    },
    Usn: 'qwe123',
    marks: 32,
    aadharNo: 12345678,
    panNo: '234567',
};
