console.log(" I am Working Mangesh");
function startTimer(){
    let getInputs = document.getElementById("showTime");
    // getInputs.innerHTML;

    setInterval(()=>{
let now = new Date();

// let hours = now.getHours().toString().padStart(2,'0');
let hours = now.getHours();
let minutes = now.getMinutes().toString().padStart(2,'0');
// let minutes = now.getMinutes().toString().padStart(2, '0'); // ✅ Fixed this line
let second = now.getSeconds().toString().padStart(2,'0');

let period = hours>=12 ? "PM" : "AM";
hours = hours%12;

hours = hours === 0 ? 12 : hours;
hours = hours.toString().padStart(2,'0');
let timeString = `${hours}:${minutes}:${second}: ${period}`;
getInputs.value=timeString;

    },1000)

     
}