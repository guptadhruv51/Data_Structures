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
for (let item in obj10)
{
  console.log(item);
}