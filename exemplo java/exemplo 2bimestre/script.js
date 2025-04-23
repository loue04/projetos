let titulo = document.querySelector("#titulo");
let campoTexto = document.querySelector("#campoTexto");
let trocarTexto = document.querySelector("#bttrocarTexto");

function alterartexto (){
    //retirando o valor digitado no input
    //e jogando na variavel
    let textodigitado = campoTexto.value;

    //atribuindo ao elemento titulo o texto que foi digitado
    //no input
    titulo.textContent = textodigitado;
}

//atribuindo uma ação ao clicar no botao
bttrocarTexto.onclick = function(){
    alterartexto();
}