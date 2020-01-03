
class Studen {
    constructor(
   
        public Usn: string,
        public marks: number,
        public aadharNo ?: number,
        public panNo ?: string
        ){
     
         }
     
}


interface Trainee extends Studen {
    name: string,
    age: number,
    printData(): void
}

class Training implements Trainee{
    name = 'abc';
    age = 21;
    Usn = 'qw123';
    marks = 100;
    aadharNo = 123;
    panNo = 'qwerty'
    data(){
        console.log('Hello');
    }
    printData() {
        console.log('hi');
    }
}


let trainee1: Trainee = {
    name: 'Raja',
    age:45,
    printData: function() {
        console.log(this.name, this.age);
    },

    Usn: 'qwe123',
    marks: 32,
    aadharNo: 12345678,
    panNo: '234567',
   
}