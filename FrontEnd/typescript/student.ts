class Stud {
    constructor(
        public name: string,
        public age: number,
        public Usn: string,
        public marks: number,
        public aadharNo ?: number,
        public panNo ?: string
        ){
     
         }
     
}


let stud1: Stud = {
    name: 'Suraj khan',
    age: 45,
    Usn: 'qwer321',
    marks: 15
}

let stud2 = new Student(
    'saif',30,'ABC123',12
);

let  clearedStudents = [
    new Student('shivani',23,'cg49',76),
    new Student('sharman',23,'cg89',98)
];

console.log(clearedStudents);
