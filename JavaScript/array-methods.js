/**
 * Array methods
 * Push and Concat
 * pop, slice, splice
 * split and join
 */
let array=["a","b","c","d"]
array.push("e");
console.log(array);
let number1=[1,2,3,4,5];
let number2=[5,6,7,8]
let arr=number1.concat(number2);
console.log(arr);

let courses=["HTML","CSS","JS","ReactJS","Angular"];
//removes last element from the array and returns it
// let item=courses.pop()
// console.log(item);
// returns an object
let value=courses.slice(3,4);
console.log(value);
// splice start number and number of elements to be deleted from that index number
//fo deleting
courses.splice(1,3);
//0: not deleting add reactjs before index 3
courses.splice(4,0,"reactjs");
console.group(courses);
// includes true or false
// const available=["S","M","L","XL","XXL","XXXL"];
// const readlineSync=require("readline-sync");
// const userSize=readlineSync.question("Required Size");
// const isavailable=available.includes(userSize);
// console.log(isavailable);

const inputStr="madam";
const arr3=[1,2,3,4,5];
const arrOfChar=inputStr.split("");
console.log(arrOfChar.reverse().join('')===inputStr);
// Spread: not an array (unpacking)
const arr4=[1,2,3,4,5];
console.log(...arr4);
//const arr3=[...arr1,2,3,...arr2,10,11]
//Destructuring Array
const numbers=[1,2,3,["html","css"]];

const[course,...rest]=numbers;
// copying an array --> Array Reference 
// done using spread
// arr1=[1,2,3,4,5];
//arr3=[...arr1];
// for loop
//let arr4=[1,2,3,4];
//let arr5=[];
// for (let number of arr4)
//arr5.push(number)