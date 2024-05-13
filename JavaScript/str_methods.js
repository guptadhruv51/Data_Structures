/**
 * charAt()| charcodet()
 * charAt(): returns a value
 * indexOf Method
 * includes: returns a boolean value 
 * uppercase()
 * lowercase()
 * trim
 */
const message="My name is Dhruv Gupta";
console.log(message.charAt(0));
console.log(message.indexOf('a'));
// starts searching from ith index
// returns -1 if not in the string
console.log(message.indexOf('a',5));
const displayMessage="I love to code in dark mode";
console.log(displayMessage.includes("dark"));
console.log(displayMessage.toUpperCase());
console.log(displayMessage.toLowerCase());
const text="      Hi";
console.log(text.trim());
