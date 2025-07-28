console.log(" I am Working");
function giveAnswer(){

    let number1 = document.getElementById("first").value;
    let number2 = document.getElementById("second").value;

    let ans = parseInt(number1) + parseInt(number2);

    document.getElementById("ans").value= ans;
    alert(ans);
    console.log(ans);

}