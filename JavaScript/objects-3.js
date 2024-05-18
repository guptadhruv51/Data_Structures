/**
 * new Keyword and constructor functions
 * Constructor functions: are regular functions. Thye have 2 conventions
 * name with first letter as capital
 * excecuted only with the new operator
 */
function User(name,age)
{
  this.name=name,
  this.age=age

}
const user=new User("abc",24);
console.log(user.name);
const person1 = {
  name: "Rishi",
  age: 30,
  greet: function() {
    console.log(`Hi, my name is ${this.name} and I'm ${this.age} years old`);
  }
};

const person2 = {
  name: "Harsh",
  age: 25
};
person1.greet.call(person2);
const greetPerson2 = person1.greet.bind(person2);
greetPerson2();