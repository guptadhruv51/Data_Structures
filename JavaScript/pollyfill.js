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


//PolyFills for reduce

const arr3=[1,2,3,4,5,6,6,7];

function getSum(acc,curr)
{
return acc+curr;
 }

const total=arr3.reduce(getSum);

console.log(total);

Array.prototype.myReduce=function(callback,initialVal)
{
  // console.log(typeof callback);
  if(typeof(callback)!='function')
    throw new Error("The given callback function is not a function");
  let acc=initialVal?initialVal:this[0];
  for(let i=initialVal?0:1;i<this.length;i++) //curr = this[i];
  {
      acc=callback(acc,this[i]);
  }

  return acc;
}

const ans=arr3.myReduce(getSum,0);
console.log(ans);




//PolyFill for flatten

const arr4=[1,2,3,4,[5,6],[[7,8]]];

const result4=arr4.flat(2);
console.log(result4);

Array.prototype.myFlat=function(depth=1)
{
  let tempArray=[];

  function getFalltenArr(array,depth)
    {
      for(let element of array)
      {
        if(Array.isArray(element) &&depth)
        {
          getFalltenArr(element,depth--);
        }
        else{
          tempArray.push(element);
        }
      }
    }
  getFalltenArr(this,depth);
  return tempArray;
};

const result5=arr4.myFlat(2);
console.log(result5);


//Polyfill for call 
const obj={
  name:'Dhruv',
  city:'Canberra',
};

function displayInfo(state)
{
  console.log(`Hi, I'm ${this.name} from ${this.city}, ${state}`);
}
Function.prototype.myCall=function(context,...args)
{
  // console.log(context);
  // console.log(this);
  context.showMessage=this;
  context.showMessage(...args);
  delete context.showMessage;
}

displayInfo.myCall(obj,"ACT");




