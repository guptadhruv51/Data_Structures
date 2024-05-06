/**
 * Read data from user
 * default input type string
 */
const readlineSync=require("readline-sync");
const userName=readlineSync.question("Enter your name ");
const userAge=Number(readlineSync.question("Enter your Age "));
console.log(`Hi ${userName}`);