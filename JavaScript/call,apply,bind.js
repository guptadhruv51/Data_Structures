let name={
firstName:"Dhruv",
lastName:"Gupta",
}
let printName=function(hometown,state)
{
  console.log(this.firstName+" "+this.lastName+" from "+hometown+", "+state);
}

printName.call(name,"Delhi"); //first argument will be the reference or whose this pointer we ned to use, second will be parameters
let name2={
  firstName:"Sachin",
  lastName:"Tendulkar"
};
//functon borrowing

printName.call(name2,"Mumbai");


printName.apply(name2,["Mumbai","Maharahtra"]); //arguments are passed as lists



let printMyName=printName.bind(name2,"Mumbai","Maharashtra"); //binds the printname and arguments and creates a copy asa function
printMyName();
console.log(printMyName);