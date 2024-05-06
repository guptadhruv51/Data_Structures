// const firstName="Dhruv";
// console.log(firstName??"Hidden");

let firstName;
console.log(firstName??"Hidden"); /**
if value is undefined or null then gives me hidden   */

let a=12;
let b;
console.log(a+(b??0));
const c=0;
console.log(c??1);