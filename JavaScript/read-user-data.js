/**
 * Read data from user
 */
const readlineSync=require("readline-sync");
const userName=readlineSync.question("Enter your name ");
console.log(`Hi ${userName}`);