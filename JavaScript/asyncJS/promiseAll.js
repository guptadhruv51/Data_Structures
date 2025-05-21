let promise1=new Promise((resolve)=>
setTimeout(()=>console.log("Promise 1 resolved"),1000)
);
let promise2=new Promise((resolve)=>
  setTimeout(()=>console.log("Promise 2 resolved"),2000)
  );
let promise3=new Promise((resolve)=>
    setTimeout(()=>console.log("Promise 3 resolved"),3000)
  );

let arrayOfPromises=[promise1,promise2,promise3];
let promises=Promise.all(arrayOfPromises);

promises.then((res)=>console.log(res));