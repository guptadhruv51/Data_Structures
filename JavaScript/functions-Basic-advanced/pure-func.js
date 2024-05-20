/**
 * Pure Functions:
 * Takes an argument
 * Returns something
 * Same input same output 
 * Result should not be influenced by outer parameters
 * Should not mutate original argument
 */
 
function doubleValue(number)
{
  return number*2;
}
const result=doubleValue(5);
console.log(result);
const x=5;
function impure(number)
{
  return number*2*x;
}
console.log(impure(5));