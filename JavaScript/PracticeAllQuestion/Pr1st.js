console.log(" I am running ");
function GivetheText(){

    let inputText= document.getElementById("m").value;
    document.getElementById("Message").value = inputText;

    alert(" You Entered Message"+inputText);
    let str = prompt("Enter the Message ");
    alert(str);
    console.log(typeof str+" and -------> "+str);

    console.log(inputText);
}