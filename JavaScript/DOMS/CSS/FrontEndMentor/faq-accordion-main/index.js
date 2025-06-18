const plusIcons=document.querySelectorAll(".plus-icon");

// plusIcon.addEventListener("click",(e)=>
// {
//   console.log(e);
// })
for(let plusIcon of plusIcons)
{
  // console.log(plusIcon);
  plusIcon.addEventListener('click', (event) => {
    const upperSection = event.target.parentElement;
    const minusIcon = upperSection.querySelector('.minus-icon');
  
    // Show minus icon, hide plus icon
    event.target.classList.toggle('d-none');
    minusIcon.classList.toggle('d-none');
  
    // Show the answer (lower-section)
    const listSection = upperSection.parentElement;
    const answer = listSection.querySelector('.lower-section');
    answer.classList.toggle('d-none');
  });
  
}
const minusIcons=document.querySelectorAll(".minus-icon")

for(let minusIcon of minusIcons)
  {
    // console.log(plusIcon);
    minusIcon.addEventListener('click', (event) => {
      const upperSection = event.target.parentElement;
      const plusIcon = upperSection.querySelector('.plus-icon');
    
      // Show minus icon, hide plus icon
      event.target.classList.toggle('d-none');
      plusIcon.classList.toggle('d-none');
    
      // Show the answer (lower-section)
      const listSection = upperSection.parentElement;
      const answer = listSection.querySelector('.lower-section');
      answer.classList.toggle('d-none');
    });
    
  }
// const plusIcons = document.querySelectorAll('.plus-icon');
// const minusIcons = document.querySelectorAll('.minus-icon');
// const allAnswers = document.querySelectorAll('.lower-section');
// function closeAllSections() {
//   allAnswers.forEach(answer => answer.classList.add('d-none'));
//   plusIcons.forEach(plus => plus.classList.remove('d-none'));
//   minusIcons.forEach(minus => minus.classList.add('d-none'));
// }
// for(let plusIcon of plusIcons)
// {
// plusIcon.addEventListener('click', (event) => {
//   // First close everything
//   closeAllSections();

//   const upperSection = event.target.parentElement;
//   const minusIcon = upperSection.querySelector('.minus-icon');
//   const listSection = upperSection.parentElement;
//   const answer = listSection.querySelector('.lower-section');

//   // Now open the selected one
//   event.target.classList.add('d-none');         // Hide plus
//   minusIcon.classList.remove('d-none');         // Show minus
//   answer.classList.remove('d-none');            // Show answer
// })
// };
