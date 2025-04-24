let inputNumero1 = document.querySelector("#inputNumero1");
let inputNumero2 = document.querySelector("#inputNumero2");
let btSomar = document.querySelector("#btSomar");
let resultado = document.querySelector("#resultado");

function somarNumero(){
    let num1 = Number(inputNumero1.value);
    let num2 = Number (inputNumero2.value);

    resultado.textContent = (num1 + num2);
}
btSomar.onclick = function(){
    somarNumero();
}