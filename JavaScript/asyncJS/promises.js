/**
 * Promises
 */
const isRequest=true;
let promise=new Promise(function(resolve,reject)
{
      if(isRequest)
      {
        setTimeout(()=>resolve("promise resolved"),3000);  //usually send data to the user
      
        }  
        else
        {
      reject("promise rejected");
        }
});

promise.then((response)=>console.log(response)).catch((reject)=>
{
  console.log(reject);
});
console.log(promise);