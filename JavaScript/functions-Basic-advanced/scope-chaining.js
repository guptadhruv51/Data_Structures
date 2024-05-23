/**
 * Scope Chaining 
 */
let a=3;
function x()
{
  let b=5;
  console.log(a);
  function y()
  {
    console.log(b);
  }
  y();
}
x();