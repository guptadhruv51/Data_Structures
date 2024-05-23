/**
 * Scope Chaining: possible because of lexical environment 
 * Lexical Environment: Has a record of variable 
 * Variable Record and reference to outer lexical environment 
 *  
 */
let a=3;
function x()
{
  let b=5;
  console.log(a);
  function y()
  {
    console.log(b); // tries to find the value in the local scope and then moves up in level
  }
  y();
}
x();