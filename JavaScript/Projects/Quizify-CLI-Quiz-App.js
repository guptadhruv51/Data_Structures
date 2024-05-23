let readlineSync=require("readline-sync");
let score=0;
let userName=readlineSync.question("What's your name ");
/**
 * Creating Question Answer Dataset
 */
const database={
  data:[
    {
      question:`let a={}, b={}
console.log(a==b)
console.log(a===b)`,
    options:{
      a:"false false",
      b:"false true",
      c:"true false",
      d:"true true"
    },
    correctAnswer:"a"
    },
    {
      question:"Object.assign(target,source) creates which type of copy",
      options:{
        a:"Deep Copy",
        b:"Shallow copy",
        c:"Nested Copy",
        d:"Creates a new reference"
      },
      correctAnswer:"b"
    },
    {
    question:"Is method chaining possible with forEach?",
      options:{
        a:"Yes",
        b:"No"
      },
      correctAnswer:"b"
    }
  ]
}
const leaderBoard={
  data:[
    {
      name:"Yuvraj",
      score:1,
    },
    {
      name:"Riya",
      score:3
    },
    {
      name:"Dhruv",
      score:2
    }
  ]
}
function playGame(userAnswer, correctAnswer)
{
if(userAnswer===correctAnswer)
{
  console.log("Correct Answer");
  score++;
}
else{
  console.log("Incorrect Answer");
  console.log(`The correct answer is ${correctAnswer}`);
}

}
function showQuestionAndOptions(database)
{
  for(let i=0; i<database.data.length;i++)
  {
    console.log(`Q${ i+1}-${database.data[i].question}`);
    for(let key in database.data[i].options)
    console.log(`${key} ${database.data[i].options[key]}`); // computed property
  let userAnswer=readlineSync.question(`Enter your answer ${Object.keys(database.data[i].options)} -`).toLowerCase();
  playGame(userAnswer,database.data[i].correctAnswer);
  }
  console.log(`\nYour score was ${score}`);

}
function highScorer(leaderBoard)
{
  leaderBoard.data.push(
    {
      name:userName,
      score:score
    }
  );
  let sortedScorelist=leaderBoard.data.sort((a,b)=>b.score-a.score)
  for (let leader of sortedScorelist)
  {
    console.log(`${leader.name} - Score: ${leader.score}`);
  }


}
showQuestionAndOptions(database); 
highScorer(leaderBoard);