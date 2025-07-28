function checkWhich_GreaterThan(){

    let f = document.getElementById("First").value;
let s = document.getElementById("second").value;

f = parseInt(f);
s = parseInt(s);

if(f>s)
{
     document.getElementById("show").value = f;
}
else{
     document.getElementById("show").value = s;
}
}
