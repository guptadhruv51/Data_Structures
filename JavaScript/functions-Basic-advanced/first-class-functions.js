/**
 * First Class Functions
 * If function is treated like other variables
 * So functions can be assigned to any other variable or passed as an argument or can be returned by another function 
 */

// const myFunction=function()
// {
//   console.group("hello Dhruv this side");
// }
// myFunction();
//02
// function wrapper()
// {
//   return "Welcome";
// }
// function greet(inner,name)
// {
//   console.log(name,inner());
// }
// greet(wrapper,"Dhruv");

//03
function greet(name)
{
  function wrapper()
  {
    console.log(name," Welcome!!");
  }
  return wrapper;
}
greet("Dhruv")();