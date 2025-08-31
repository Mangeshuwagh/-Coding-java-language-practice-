function numbers(){
     let number = document.getElementById("giveNumber").value;

     let resultDiv = document.getElementById("result");
     resultDiv.innerHTML="";
                 if (isNaN(number)|| number.trim()==="") {
                resultDiv.innerHTML = "Please enter a valid number.";
                return;
            }

    number = parseInt(number);
    for(let m =1 ;m<=10;m++){

        setTimeout(()=>{
            let line = number+"x"+ m+ " = " + (number*m);
            resultDiv.innerHTML+= line+ "<br>";

        },m*1000
        );

        
    
         
    }
}