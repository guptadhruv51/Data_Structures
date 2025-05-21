//Polyfill for Map
const arr=[1,2,3,4,5];
// const squared=arr.map((a)=>a**2);
// console.log(squared);


function getSquare(number)
{
  return number**2;
}

Array.prototype.myMap=function (callback)
{
  let tempArray=[];
  for(let i=0;i<this.length;i++)
    tempArray.push(callback(this[i]));    
  return tempArray;
}


const squared2=arr.myMap(getSquare);
console.log(squared2);

//Polyfill for filter


const arr2=[1,2,3,4,5,6];
function getfilter(number)
{
  return number >3; //returns a boolean value

}
const result=arr2.filter(getfilter);

console.log(result);

Array.prototype.myFilter=function(callback)
{
  let tempArray=[];
  
  for(let i=0;i<this.length;i++)
  {
    if(callback(this[i]))
      tempArray.push(this[i]);
  }

  return tempArray;

}

const result2=arr2.myFilter(getfilter);
console.log(result2);