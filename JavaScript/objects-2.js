/**
 * Destructurig Objects
 */

let obj={
  name:"Dhruv",
  address:{
    state:"Delhi",
    locality:"Model Town"
  },
  courses:["HTML","CSS","JS"]
}
// let {name,address,courses}=obj;
// console.log(name);
// console.log(address);
// let{name,...rest}=obj;
// console.log(rest);
let{name,address:{state,locality},courses}=obj;
console.log(state);
/**
 * Object Methods
 * entries: returns an array of arrays
 * keys: returns the properties
 * values: return the values    Object.keys(obj) Object.values() Object.entries()
 */

/**
 * This keyword
 * Refers to tge object that is excecuting the function
 * Arrow function doesnto point to the object it is being declared in (refers to Window : global object)
 */
const obj2={
name:"Dhruv",
displayMessage:function()
{
  console.log("hello"+this.name); //implicit binding
}
};
obj2.displayMessage();