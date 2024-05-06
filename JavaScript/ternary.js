/**
 * condition?yes:no;
 * Less Readable 
 */
const totalMarks=85.5;
const result=totalMarks<40?"Work Hard":"You'll be fine";
console.log(result);
const result2=totalMarks<40?"Work hard":totalMarks<60?"B grade":totalMarks<75?"A grade":totalMarks<85?"A+ Grade":"Genius";
console.log(result2)