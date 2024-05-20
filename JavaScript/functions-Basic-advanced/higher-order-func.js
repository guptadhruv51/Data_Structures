/**
 * Higher Order Func:
 * Function that accepts another function as an argument 
 */
// function wrapper()
// {
//   return "Welcome";
// }
// function greet(wrapper)
// {
//   console.log("Dhruv",wrapper());
// }
// greet(wrapper);
//Higher Oder Function
function displayMessage()
{
  //First Class Function
  return function()
  {
     console.log("hello from inner");
  }
}
displayMessage()();
const arr=[1,2,3,4,5];

// function squarenumber(arr)
// {
//   let arr2=[];
//   for(let number of arr)
//   {
//     arr2.push(number*number);
//   }
//   return arr2;
// }
// console.log(squarenumber(arr));
// function cubenumber(arr)
// {
//   let arr2=[];
//   for(let number of arr)
//   {
//     arr2.push(number**3);
//   }
//   return arr2;
// }
// console.log(cubenumber(arr));
function square(number)
{
  return number **2;
}
function cube(number)
{
  return number **3;
}
function calculatePower(wrapper,arr)
{
  let temp=[];
for(let number of arr)
{
  temp.push(wrapper(number));
}
return temp;
}
const squarenumber=calculatePower(square,arr);
console.log(squarenumber);
const cubenumber=calculatePower(cube,arr);
console.log(cubenumber);

