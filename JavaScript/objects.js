/**
 * Object
 * Function as a property
 */
const obj={
  name:"Dhruv Gupta",
  greetMessage:function()
  {
    console.log(`Hi ${obj.name}`);
  },
  // function bye()
  // {
  //   console.log("Bye");
  // }
  bye()
  {
    console.log("Bye");
  }
}
obj.greetMessage();
obj.bye();
/**
 * Adding Property 
 * Computing property
 */
const obj3={
  name:"Dhruv",
  age:25
}
obj3.city="Canberra";
console.log(obj3);
/**
 * Computed Property: need to use [] brackets
 * []-> means the value needs to be computed without quotes because it is not a property 
 * 
 */
// const readlineSync=require('readline-sync');
// const key=readlineSync.question("Enter property");
// console.log(obj3[key]);
/**
 * Short Hand
 * When the name of key and value is same
 */
function getObjcts(name,city)
{
  return {
    name,
    city
  }
}
const obj5=getObjcts("Dhruv","Dilli");
console.log(obj5);
const obj10={
  name:"Dhruv",
  city:"Mumbai"
}
// prints the keys in the object 
// obj10[item]
for (let item in obj10)
{
  console.log(item);
}
/**
 * Object reference and shallow copy
 * Objects are not copied by value but by reference 
 */
const p1={
  name:'Prakash',
  age:101
}
// const p2=p1;
// p2.name="Ashish";
// console.log(p1); // shallow copy
// console.log(p2); 

const p2=Object.assign({},p1); // still shallow copy 
p2.name="Dhruv";
console.log(p1);
console.log(p2);

/**
 * Optional Chanining
 */
const user={
  name:"Dhruv",
  age:25,
  address:
  {
    street:"Hennessy Street",
    city:"Canberra"
  }
}
console.log(user.address.city);
if(user.address!=undefined)
{
  console.log(user.address.city);
}
else{
  console.log("Address not found");
}
console.log(user.address?.city); // optional chaining 