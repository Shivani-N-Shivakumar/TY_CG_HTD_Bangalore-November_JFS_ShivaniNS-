console.log('Typescript code started'); 

let a = 100;//implicitly considered as let a: number
a=null;
//a='string';error cannot reassign type number to string
let b;//implicitly considered as any type
b=100;
b='raj';
console.log(b);

let marks: number[] = [1,2,3,4,5];

let student: {name: string, age: number,pass: boolean};
student = {
    name: 'XYZ',
    age: 35, 
    pass: true

}


class Sample {
    a = 100;
    b = 'abc';
}
let sample1 = new Sample();
console.log(sample1.a);
console.log(sample1.b);

class Student{
    constructor(
   public name: string,
   public age: number,
   public Usn: string,
   public marks: Number){

    }

    printDetails(): void{
          console.log(`
          Name is ${this.name},
          age is ${this.age},
          usn is ${this.Usn},
          marks is ${this.marks}
          `);
    }
     

}




let student1 = new Student('raj',56,'qwert123',105);
console.log('student name is',student1.name);
console.log(student1.printDetails);

console.log('Typescript code ended'); 