function verificarTriangulo() {
            const x = parseFloat(document.getElementById("ladoX").value);
            const y = parseFloat(document.getElementById("ladoY").value);
            const z = parseFloat(document.getElementById("ladoZ").value);
            const resultado = document.getElementById("resultado");

            if (isNaN(x) || isNaN(y) || isNaN(z)) {
                resultado.textContent = "Por favor, insira valores válidos para todos os lados.";
                return;
            }

            if (x + y > z && x + z > y && y + z > x) {
                if (x === y && y === z) {
                    resultado.textContent = "Triangulo equilátero";
                } else if (x === y || x === z || y === z) {
                    resultado.textContent = "Triangulo isósceles";
                } else {
                    resultado.textContent = "Triangulo escaleno";
                }
            } else {
                resultado.textContent = "Não é possível formar um triângulo com esses lados.";
            }
        }

         function calcularIMC() {
      const peso = parseFloat(document.getElementById("peso").value);
      const altura = parseFloat(document.getElementById("altura").value);
      const resultado = document.getElementById("resultado");

      if (!peso || !altura || altura <= 0) {
        resultado.textContent = "Por favor, insira valores válidos.";
        return;
      }

      const imc = peso / (altura * altura);
      let classificacao = "";

      if (imc < 18.5) {
        classificacao = "Abaixo do peso";
      } else if (imc < 25) {
        classificacao = "Peso normal";
      } else if (imc < 30) {
        classificacao = "Sobrepeso";
      } else if (imc < 35) {
        classificacao = "Obesidade grau 1";
      } else if (imc < 40) {
        classificacao = "Obesidade grau 2";
      } else {
        classificacao = "Obesidade grau 3";
      }

      resultado.textContent = `Seu IMC é ${imc.toFixed(2)} (${classificacao})`;
    }

    function calcularImposto() {
      const ano = parseInt(document.getElementById("ano").value);
      const valor = parseFloat(document.getElementById("valor").value);
      const resultado = document.getElementById("resultado");

      if (!ano || !valor || ano <= 0 || valor <= 0) {
        resultado.textContent = "Por favor, insira valores válidos.";
        return;
      }

      let taxa = 0;

      if (ano < 1990) {
        taxa = 0.01;
      } else {
        taxa = 0.015;
      }

      const imposto = valor * taxa;
      resultado.textContent = `O imposto a ser pago é R$ ${imposto.toFixed(2)}`;
    }

    function calcularSalario() {
      const nivel = parseInt(document.getElementById("nivel").value);
      const horasSemana = parseFloat(document.getElementById("horas").value);
      const resultado = document.getElementById("resultado");

      if (!horasSemana || horasSemana <= 0) {
        resultado.textContent = "Por favor, insira uma quantidade válida de horas.";
        return;
      }

      let valorHora;

      if (nivel === 1) {
        valorHora = 12.00;
      } else if (nivel === 2) {
        valorHora = 17.00;
      } else if (nivel === 3) {
        valorHora = 25.00;
      } else {
        resultado.textContent = "Nível inválido.";
        return;
      }

      const salario = valorHora * horasSemana * 4.5;

      resultado.textContent = `Salário mensal: R$ ${salario.toFixed(2)}`;
    }

