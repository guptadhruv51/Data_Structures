/**
 * map, Filter : Higher order functions because they take a function as an argument
 */
const arr=[1,2,3,4,5,6,7,8,9,10];
function getSquare(number)
{
  return number **2;
}
// function squarenumber(arr)
// {

//   const temparr=[];
//   for(let number of arr)
//   {
//     temparr.push(number**2);
//   }
//   return temparr;
// }
// const result=squarenumber(arr);
// console.log(result);
const output=arr.map(getSquare);
console.log(output);
const squareNumbers=arr.map((number)=>number**2);
console.log(squareNumbers);
/**
 * Filter
 */
const arr2=[1,2,3,4,5,6,7,8,9,10];
function greaterthan(number)
{
  return number>5;
} 
const output2=arr2.filter(greaterthan);
console.log(output2);
const output3=(arr2.filter((number)=>number>5)).map(getSquare);
console.log(output3);
/**
 * Reduce
 */

const arr4=[1,2,3,4,5,6,7,8,9,10];
//acc=0, curr=first item in the array 
//0+1=1-->acc curr=2
//curr=aray elements one by one 
const reduceFn=(acc,curr)=>acc+curr;
const output4=arr4.reduce((acc,curr)=>acc*curr,1);
console.log(output4);