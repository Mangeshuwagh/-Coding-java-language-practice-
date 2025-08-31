console.log(" Hello Guys I am Mangesh Wagh");
function calPower(){

    
    let number1 = document.getElementById("num1").value;
    let power = document.getElementById("num2").value;
    
    number1 = parseInt(number1);
    power = parseInt(power);
    let getDiv = document.getElementById("showResult");
    if (isNaN(number1) || isNaN(power)) {
        getDiv.innerHTML = "Please enter valid numbers.";
        return;
    }
    let nu =1;
    for(let i = 1 ;i<= power;i++){
        
        nu*=number1;
    }
    getDiv.innerHTML = number1 +" raised to the power of "+ power + " is : "+ nu;
    
    // getDiv+= nu;
    
    
}