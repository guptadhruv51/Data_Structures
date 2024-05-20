/**
 * Arguments object and Rest Parameter
 */
function calculateTotal(a,b)
{
  //arguments: array like object
  arguments[0]=9;
  console.log(...arguments);
  //return a+b;
}
//const total=calculateTotal(1,2,3,4,5);
//console.log(total)
// When there is a function with default value as function parameter, we can use argument to change the value but 
//that will not change the value of the variable passed as an argument 
calculateTotal(1,2,3,4,5);

function calculateTotal2(a,b,...rest)
{
//a=4,b=5 rest=[7,8,9,1,2,3]
console.log(a,b);
console.log(rest);
}
calculateTotal2(4,5,6,7,8,9,1,2,3)