let startBtn=document.querySelector("#btn-start");
let cntBtn=document.querySelector("#btn-count");
let stopBtn=document.querySelector("#btn-stop");
let value=0;
let input=document.querySelector(".input");
let enterBtn=document.querySelector("#btn-enter");
// input.addEventListener("change",()=>
// {
//   console.log(input.value);
// })
enterBtn.addEventListener("click",()=>
{
  console.log(input.value);
})

// input.addEventListener("input",()=>
// {
//   console.log(input.value);
// })

function showMessage()
{
  console.log("Button CLicked");
}
startBtn.addEventListener("click",()=>
  {
    // if(startBtn.innerText==="Start")
    // {
    //   startBtn.innerText="Clicked";
    // }
    // else
    // {
    //   startBtn.innerText="Start";
    // }

    startBtn.innerHTML="<span> Clicked </span>"
});

cntBtn.addEventListener("click",()=>
{
  value++;
    console.log(value);
})

stopBtn.addEventListener("click",()=>
{   
  // if(!stopBtn.classList.contains("btn-red"))
  //   stopBtn.classList.add("btn-red");
  // else{
  //   stopBtn.classList.remove("btn-red");
  // }

  stopBtn.classList.toggle("btn-red");
})