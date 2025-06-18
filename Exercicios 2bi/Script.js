// Exercício 1 - Cálculo de Troco
function calcularTroco() {
    let valorPago = parseFloat(document.querySelector('#valorPago').value);
    let precoProduto = parseFloat(document.querySelector('#precoProduto').value);
    let resultado = document.querySelector('#resultado1');
    
    if (isNaN(valorPago)) {
        resultado.textContent = "Por favor, insira um valor pago válido.";
        resultado.className = "resultado error";
        return;
    }
    
    if (isNaN(precoProduto)) {
        resultado.textContent = "Por favor, insira um preço de produto válido.";
        resultado.className = "resultado error";
        return;
    }
    
    let troco = valorPago - precoProduto;
    
    if (troco < 0) {
        resultado.textContent = `Dinheiro insuficiente. Faltam R$ ${Math.abs(troco).toFixed(2)}`;
        resultado.className = "resultado error";
    } else {
        resultado.textContent = `Troco: R$ ${troco.toFixed(2)}`;
        resultado.className = "resultado success";
    }
}

// Exercício 2 - Cálculo de Valor por Peso
function calcularValorPorPeso() {
    let precoQuilo = parseFloat(document.querySelector('#precoQuilo').value);
    let quantidade = parseFloat(document.querySelector('#quantidade').value);
    let resultado = document.querySelector('#resultado2');
    
    if (isNaN(precoQuilo) || isNaN(quantidade)) {
        resultado.textContent = "Por favor, insira valores válidos.";
        resultado.className = "resultado error";
        return;
    }
    
    let valorFinal = precoQuilo * quantidade;
    resultado.textContent = `Valor a pagar: R$ ${valorFinal.toFixed(2)}`;
    resultado.className = "resultado success";
}

// Exercício 3 - Reajuste de Saldo
function calcularReajuste() {
    let saldo = parseFloat(document.querySelector('#saldo').value);
    let resultado = document.querySelector('#resultado3');
    
    if (isNaN(saldo)) {
        resultado.textContent = "Por favor, insira um valor válido.";
        resultado.className = "resultado error";
        return;
    }
    
    let saldoReajustado = saldo * 1.01;
    resultado.innerHTML = `
        <p>Saldo original: R$ ${saldo.toFixed(2)}</p>
        <p>Saldo reajustado (1%): R$ ${saldoReajustado.toFixed(2)}</p>
    `;
    resultado.className = "resultado success";
}

// Exercício 4 - Cálculos com 3 Números
function calcularMedias() {
    let num1 = parseFloat(document.querySelector('#numero1').value);
    let num2 = parseFloat(document.querySelector('#numero2').value);
    let num3 = parseFloat(document.querySelector('#numero3').value);
    let resultado = document.querySelector('#resultado4');
    
    if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
        resultado.textContent = "Por favor, insira valores válidos para todos os números.";
        resultado.className = "resultado error";
        return;
    }
    
    let mediaAritmetica = (num1 + num2 + num3) / 3;
    let mediaPonderada = (num1 * 3 + num2 * 2 + num3 * 5) / 10;
    let somaMedias = mediaAritmetica + mediaPonderada;
    let mediaDasMedias = somaMedias / 2;
    
    resultado.innerHTML = `
        <p>Média Aritmética: ${mediaAritmetica.toFixed(2)}</p>
        <p>Média Ponderada: ${mediaPonderada.toFixed(2)}</p>
        <p>Soma das Médias: ${somaMedias.toFixed(2)}</p>
        <p>Média das Médias: ${mediaDasMedias.toFixed(2)}</p>
    `;
    resultado.className = "resultado success";
}

// Exercício 5 - Maior entre 2 Valores
function compararValores() {
    let valor1 = parseFloat(document.querySelector('#valor1').value);
    let valor2 = parseFloat(document.querySelector('#valor2').value);
    let resultado = document.querySelector('#resultado5');
    
    if (isNaN(valor1) || isNaN(valor2)) {
        resultado.textContent = "Por favor, insira valores válidos.";
        resultado.className = "resultado error";
        return;
    }
    
    if (valor1 > valor2) {
        resultado.textContent = `O maior valor é: ${valor1}`;
    } else if (valor2 > valor1) {
        resultado.textContent = `O maior valor é: ${valor2}`;
    } else {
        resultado.textContent = "Os valores são iguais.";
    }
    resultado.className = "resultado success";
}

// Exercício 6 - Menor entre 4 Valores
function encontrarMenor() {
    let valor1 = parseFloat(document.querySelector('#valor1-6').value);
    let valor2 = parseFloat(document.querySelector('#valor2-6').value);
    let valor3 = parseFloat(document.querySelector('#valor3-6').value);
    let valor4 = parseFloat(document.querySelector('#valor4-6').value);
    let resultado = document.querySelector('#resultado6');
    
    if (isNaN(valor1) || isNaN(valor2) || isNaN(valor3) || isNaN(valor4)) {
        resultado.textContent = "Por favor, insira valores válidos para todos os campos.";
        resultado.className = "resultado error";
        return;
    }
    
    let menor = Math.min(valor1, valor2, valor3, valor4);
    resultado.textContent = `O menor valor é: ${menor}`;
    resultado.className = "resultado success";
}

// Exercício 7 - Verificar Número Ímpar
function verificarImpar() {
    let numero = parseInt(document.querySelector('#numero').value);
    let resultado = document.querySelector('#resultado7');
    
    if (isNaN(numero)) {
        resultado.textContent = "Por favor, insira um número válido.";
        resultado.className = "resultado error";
        return;
    }
    
    if (numero % 2 !== 0) {
        resultado.textContent = `${numero} é ímpar.`;
    } else {
        resultado.textContent = `${numero} não é ímpar.`;
    }
    resultado.className = "resultado success";
}

// Exercício 1 Atividade 2: Variação do Dólar
function calcularVariacoes() {
    let cotacao = parseFloat(document.querySelector('#cotacao').value);
    let resultado = document.querySelector('#resultado2-1');
    
    if (isNaN(cotacao) || cotacao <= 0) {
        resultado.innerHTML = "<p class='error'>Por favor, insira uma cotação válida</p>";
        return;
    }
    
    let variacoes = [
        { percentual: 1, valor: cotacao * 1.01 },
        { percentual: 2, valor: cotacao * 1.02 },
        { percentual: 5, valor: cotacao * 1.05 },
        { percentual: 10, valor: cotacao * 1.10 }
    ];
    
    let html = "<h3>Resultados:</h3>";
    variacoes.forEach(v => {
        html += `<p>+${v.percentual}% = R$ ${v.valor.toFixed(2)}</p>`;
    });
    
    resultado.innerHTML = html;
}

// Exercício 2 Atividade 2: Cálculo para Omelete
function calcularIngredientes() {
    let pessoas = parseInt(document.querySelector('#pessoas').value);
    let resultado = document.querySelector('#resultado2-2');
    
    if (isNaN(pessoas) || pessoas <= 0) {
        resultado.innerHTML = "<p class='error'>Por favor, insira um número válido de pessoas</p>";
        return;
    }
    
    let ovos = pessoas * 2;
    let queijo = pessoas * 50;
    
    resultado.innerHTML = `
        <h3>Ingredientes necessários:</h3>
        <p>Ovos: ${ovos} unidades</p>
        <p>Queijo: ${queijo}g</p>
    `;
}

// Exercício 3 Atividade 2: Operações Matemáticas
function calcularOperacoes() {
    let num1 = parseFloat(document.querySelector('#numero1-2').value);
    let num2 = parseFloat(document.querySelector('#numero2-2').value);
    let resultado = document.querySelector('#resultado2-3');
    
    if (isNaN(num1) || isNaN(num2)) {
        resultado.innerHTML = "<p class='error'>Por favor, insira ambos os números</p>";
        return;
    }
    
    resultado.innerHTML = `
        <h3>Resultados:</h3>
        <p>Soma: ${num1 + num2}</p>
        <p>Subtração: ${num1 - num2}</p>
        <p>Multiplicação: ${num1 * num2}</p>
        <p>Divisão: ${(num1 / num2).toFixed(2)}</p>
    `;
}

// Exercício 4 Atividade 2: Pedido de Pizza
function calcularPedido() {
    // Obter sabores
    let sabores = [
        document.querySelector('#sabor1').value,
        document.querySelector('#sabor2').value,
        document.querySelector('#sabor3').value,
        document.querySelector('#sabor4').value
    ].filter(sabor => sabor.trim() !== "");
    
    // Obter refrigerantes
    let refrigerantes = parseInt(document.querySelector('#refrigerantes').value) || 0;
    
    // Calcular valores
    let valorPizzas = sabores.length * 12;
    let valorRefrigerantes = refrigerantes * 7;
    let total = valorPizzas + valorRefrigerantes;
    
    // Exibir resultado
    let resultado = document.querySelector('#resultado2-4');
    resultado.innerHTML = `
        <h3>Seu pedido:</h3>
        <p>Sabores: ${sabores.join(", ")}</p>
        <p>Refrigerantes: ${refrigerantes}</p>
        <h4>Total a pagar: R$ ${total.toFixed(2)}</h4>
    `;
}

// Exercício 1 Atividade 3
function calcularAreaTerreno() {
    let largura = parseFloat(document.querySelector('#largura').value);
    let comprimento = parseFloat(document.querySelector('#comprimento').value);
    let resultado = document.querySelector('#resultado3-1');
    
    if (isNaN(largura) || isNaN(comprimento) || largura <= 0 || comprimento <= 0) {
        resultado.innerHTML = "<p class='error'>Insira valores válidos para largura e comprimento</p>";
        return;
    }
    
    let area = largura * comprimento;
    resultado.innerHTML = `<p>Área do terreno: ${area.toFixed(2)} m²</p>`;
}

// Exercício 2 Atividade 3
function calcularFerraduras() {
    let cavalos = parseInt(document.querySelector('#cavalos').value);
    let resultado = document.querySelector('#resultado3-2');
    
    if (isNaN(cavalos) || cavalos <= 0) {
        resultado.innerHTML = "<p class='error'>Insira um número válido de cavalos</p>";
        return;
    }
    
    let ferraduras = cavalos * 4;
    resultado.innerHTML = `<p>Quantidade de ferraduras necessárias: ${ferraduras}</p>`;
}

// Exercício 3 Atividade 3
function calcularPadaria() {
    let paes = parseInt(document.querySelector('#paes').value) || 0;
    let broas = parseInt(document.querySelector('#broas').value) || 0;
    let resultado = document.querySelector('#resultado3-3');
    
    if (paes < 0 || broas < 0) {
        resultado.innerHTML = "<p class='error'>Quantidades não podem ser negativas</p>";
        return;
    }
    
    let total = (paes * 0.12) + (broas * 1.50);
    let poupanca = total * 0.1;
    
    resultado.innerHTML = `
        <p>Total arrecadado: R$ ${total.toFixed(2)}</p>
        <p>Valor para poupança (10%): R$ ${poupanca.toFixed(2)}</p>
    `;
}

// Exercício 4 Atividade 3
function calcularDiasVida() {
    let nome = document.querySelector('#nome').value.trim();
    let idade = parseInt(document.querySelector('#idade').value);
    let resultado = document.querySelector('#resultado3-4');
    
    if (nome === "" || isNaN(idade) || idade <= 0) {
        resultado.innerHTML = "<p class='error'>Insira nome e idade válidos</p>";
        return;
    }
    
    let dias = idade * 365;
    resultado.innerHTML = `<p>${nome.toUpperCase()}, VOCÊ JÁ VIVEU ${dias} DIAS</p>`;
}

// Exercício 5 Atividade 3
function calcularCombustivel() {
    let preco = parseFloat(document.querySelector('#precoGasolina').value);
    let valor = parseFloat(document.querySelector('#valorPagamento').value);
    let resultado = document.querySelector('#resultado3-5');
    
    if (isNaN(preco) || isNaN(valor) || preco <= 0 || valor <= 0) {
        resultado.innerHTML = "<p class='error'>Insira valores válidos</p>";
        return;
    }
    
    let litros = valor / preco;
    resultado.innerHTML = `<p>Quantidade de litros: ${litros.toFixed(2)}</p>`;
}

// Exercício 6 Atividade 3
function calcularRefeicao() {
    let peso = parseFloat(document.querySelector('#pesoPrato').value);
    let resultado = document.querySelector('#resultado3-6');
    
    if (isNaN(peso) || peso <= 0) {
        resultado.innerHTML = "<p class='error'>Insira um peso válido</p>";
        return;
    }
    
    let valor = peso * 12;
    resultado.innerHTML = `<p>Valor a pagar: R$ ${valor.toFixed(2)}</p>`;
}

// Exercício 7 Atividade 3
function calcularDiasAno() {
    let dia = parseInt(document.querySelector('#dia').value);
    let mes = parseInt(document.querySelector('#mes').value);
    let resultado = document.querySelector('#resultado3-7');
    
    if (isNaN(dia) || isNaN(mes) || dia < 1 || dia > 31 || mes < 1 || mes > 12) {
        resultado.innerHTML = "<p class='error'>Insira uma data válida</p>";
        return;
    }
    
    let dias = (mes - 1) * 30 + dia;
    resultado.innerHTML = `<p>Dias desde o início do ano: ${dias}</p>`;
}

// Exercício 8 Atividade 3
function calcularCamisetas() {
    let pequenas = parseInt(document.querySelector('#pequenas').value) || 0;
    let medias = parseInt(document.querySelector('#medias').value) || 0;
    let grandes = parseInt(document.querySelector('#grandes').value) || 0;
    let resultado = document.querySelector('#resultado3-8');
    
    if (pequenas < 0 || medias < 0 || grandes < 0) {
        resultado.innerHTML = "<p class='error'>Quantidades não podem ser negativas</p>";
        return;
    }
    
    let total = (pequenas * 10) + (medias * 12) + (grandes * 15);
    resultado.innerHTML = `<p>Valor total arrecadado: R$ ${total.toFixed(2)}</p>`;
}

// Exercício 9 Atividade 3
function calcularDistancia() {
    let x1 = parseFloat(document.querySelector('#x1').value);
    let y1 = parseFloat(document.querySelector('#y1').value);
    let x2 = parseFloat(document.querySelector('#x2').value);
    let y2 = parseFloat(document.querySelector('#y2').value);
    let resultado = document.querySelector('#resultado3-9');
    
    if (isNaN(x1) || isNaN(y1) || isNaN(x2) || isNaN(y2)) {
        resultado.innerHTML = "<p class='error'>Insira coordenadas válidas</p>";
        return;
    }
    
    let distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    resultado.innerHTML = `<p>Distância entre os pontos: ${distancia.toFixed(2)}</p>`;
}

// Exercício 10 Atividade 3
function converterDiasTrabalho() {
    let dias = parseInt(document.querySelector('#diasTrabalho').value);
    let resultado = document.querySelector('#resultado3-10');
    
    if (isNaN(dias) || dias <= 0) {
        resultado.innerHTML = "<p class='error'>Insira um número válido de dias</p>";
        return;
    }
    
    let anos = Math.floor(dias / 365);
    let meses = Math.floor((dias % 365) / 30);
    let diasRestantes = dias % 30;
    
    resultado.innerHTML = `
        <p>${dias} dias equivalem a:</p>
        <p>${anos} anos, ${meses} meses e ${diasRestantes} dias</p>
    `;
}

// Exercício 11 Atividade 3
function calcularAjusteSalarial() {
    let salario = parseFloat(document.querySelector('#salario').value);
    let resultado = document.querySelector('#resultado3-11');
    
    if (isNaN(salario) || salario <= 0) {
        resultado.innerHTML = "<p class='error'>Insira um salário válido</p>";
        return;
    }
    
    let comAumento = salario * 1.15;
    let salarioFinal = comAumento * 0.92;
    
    resultado.innerHTML = `
        <p>Salário inicial: R$ ${salario.toFixed(2)}</p>
        <p>Salário com aumento (15%): R$ ${comAumento.toFixed(2)}</p>
        <p>Salário final (descontados 8%): R$ ${salarioFinal.toFixed(2)}</p>
    `;
}

// Exercício 12 Atividade 3
function decomporNumero() {
    let numero = parseInt(document.querySelector('#numero3dig').value);
    let resultado = document.querySelector('#resultado3-12');
    
    if (isNaN(numero) || numero < 0 || numero > 999) {
        resultado.innerHTML = "<p class='error'>Insira um número entre 0 e 999</p>";
        return;
    }
    
    let centena = Math.floor(numero / 100);
    let dezena = Math.floor((numero % 100) / 10);
    let unidade = numero % 10;
    
    resultado.innerHTML = `
        <p>CENTENA = ${centena}</p>
        <p>DEZENA = ${dezena}</p>
        <p>UNIDADE = ${unidade}</p>
    `;
}

// Exercício 13 Atividade 3
function calcularAreaPizza() {
    let raio = parseFloat(document.querySelector('#raioPizza').value);
    let resultado = document.querySelector('#resultado3-13');
    
    if (isNaN(raio) || raio <= 0) {
        resultado.innerHTML = "<p class='error'>Insira um raio válido</p>";
        return;
    }
    
    let area = 3.14 * Math.pow(raio, 2);
    resultado.innerHTML = `<p>Área da pizza: ${area.toFixed(2)} cm²</p>`;
}

// Exercício 14 Atividade 3
function dividirConta() {
    let total = parseFloat(document.querySelector('#totalConta').value);
    let resultado = document.querySelector('#resultado3-14');
    
    if (isNaN(total) || total <= 0) {
        resultado.innerHTML = "<p class='error'>Insira um valor válido</p>";
        return;
    }
    
    let parte = total / 3;
    let carlos = Math.floor(parte);
    let andre = Math.floor(parte);
    let felipe = total - carlos - andre;
    
    resultado.innerHTML = `
        <p>Carlos paga: R$ ${carlos.toFixed(2)}</p>
        <p>André paga: R$ ${andre.toFixed(2)}</p>
        <p>Felipe paga: R$ ${felipe.toFixed(2)}</p>
    `;
}