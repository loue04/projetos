function somar() {
    const num1 = parseFloat(document.getElementById("numero1").value);
    const num2 = parseFloat(document.getElementById("numero2").value);
    const resultado = num1 + num2;

    if (isNaN(resultado)) {
      document.getElementById("resultado").innerText = "Por favor, insira dois números válidos.";
    } else {
      document.getElementById("resultado").innerText = "Resultado: " + resultado;
    }
  }