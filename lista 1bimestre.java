import java.util.*;
import java.lang.Math;

public class lista1bim_lauany_sibaldeli {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===== LISTA DE EXERCÍCIOS 1º BIM =====");
            System.out.println("1 - Comparar dois números");
            System.out.println("2 - Par ou Ímpar");
            System.out.println("3 - Consumo de água");
            System.out.println("4 - Potência ou Raiz");
            System.out.println("5 - Tipo de Triângulo");
            System.out.println("6 - Peso Ideal");
            System.out.println("7 - Idade para votar e CNH");
            System.out.println("8 - Categoria de Natação");
            System.out.println("9 - Soma de pares até 0");
            System.out.println("10 - Adivinhar número");
            System.out.println("11 - Sorteio entre 10 e 29");
            System.out.println("12 - Ordenação de 3 números");
            System.out.println("13 - Contar vogais e consoantes");
            System.out.println("14 - Validador de senha");
            System.out.println("15 - Função cálculo");
            System.out.println("0 - Sair");
            System.out.print("Escolha o exercício: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch(opcao) {
                case 1 -> exercicio1();
                case 2 -> exercicio2();
                case 3 -> exercicio3();
                case 4 -> exercicio4();
                case 5 -> exercicio5();
                case 6 -> exercicio6();
                case 7 -> exercicio7();
                case 8 -> exercicio8();
                case 9 -> exercicio9();
                case 10 -> exercicio10();
                case 11 -> exercicio11();
                case 12 -> exercicio12();
                case 13 -> exercicio13();
                case 14 -> exercicio14();
                case 15 -> exercicio15();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    // 1) Comparar dois números
    static void exercicio1() {
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        if(a > b) System.out.println("O primeiro é maior.");
        else if(a < b) System.out.println("O primeiro é menor.");
        else System.out.println("Os dois são iguais.");
    }

    // 2) Par ou ímpar
    static void exercicio2() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Par" : "Ímpar");
    }

    // 3) Consumo de água
    static void exercicio3() {
        System.out.print("Leitura dia 1: ");
        double d1 = sc.nextDouble();
        System.out.print("Leitura dia 30: ");
        double d30 = sc.nextDouble();
        double consumo = d30 - d1;
        System.out.println("Consumo total: " + consumo + " litros");
        System.out.println("Média diária: " + (consumo / 30));
    }

    // 4) Potência ou Raiz
    static void exercicio4() {
        System.out.print("Digite um número: ");
        double n = sc.nextDouble();
        if(n > 10 && n < 100)
            System.out.printf("Potência: %.5f%n", Math.pow(n, 2));
        else
            System.out.printf("Raiz quadrada: %.5f%n", Math.sqrt(n));
    }

    // 5) Triângulo
    static void exercicio5() {
        System.out.print("Lado A: ");
        double a = sc.nextDouble();
        System.out.print("Lado B: ");
        double b = sc.nextDouble();
        System.out.print("Lado C: ");
        double c = sc.nextDouble();
        if(a < b + c && b < a + c && c < a + b) {
            if(a == b && b == c)
                System.out.println("Triângulo Equilátero");
            else if(a == b || b == c || a == c)
                System.out.println("Triângulo Isósceles");
            else
                System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Não formam um triângulo");
        }
    }

    // 6) Peso ideal
    static void exercicio6() {
        System.out.print("Altura (m): ");
        double h = sc.nextDouble();
        System.out.print("Sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        System.out.print("Peso atual (kg): ");
        double peso = sc.nextDouble();
        double ideal = (sexo == 'M') ? (72.7 * h) - 58 : (62.1 * h) - 44.7;
        System.out.printf("Peso ideal: %.2f kg%n", ideal);
        if(peso < ideal) System.out.println("Abaixo do peso ideal");
        else if(peso > ideal) System.out.println("Acima do peso ideal");
        else System.out.println("No peso ideal");
    }

    // 7) Idade e habilitação
    static void exercicio7() {
        System.out.print("Ano de nascimento: ");
        int ano = sc.nextInt();
        int idade = 2025 - ano;
        if(idade >= 18)
            System.out.println("Pode votar e tirar CNH");
        else if(idade >= 16)
            System.out.println("Pode votar, mas não tirar CNH");
        else
            System.out.println("Não pode votar nem tirar CNH");
    }

    // 8) Categoria de natação
    static void exercicio8() {
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        if(idade >= 5 && idade <= 7) System.out.println("Infantil A");
        else if(idade <= 10) System.out.println("Infantil B");
        else if(idade <= 13) System.out.println("Juvenil A");
        else if(idade <= 17) System.out.println("Juvenil B");
        else System.out.println("Adulto");
    }

    // 9) Soma de pares até digitar 0
    static void exercicio9() {
        int soma = 0, n;
        do {
            System.out.print("Digite um número (0 para sair): ");
            n = sc.nextInt();
            if(n % 2 == 0) soma += n;
        } while(n != 0);
        System.out.println("Soma dos pares: " + soma);
    }

    // 10) Adivinhar número
    static void exercicio10() {
        Random rand = new Random();
        int numero = rand.nextInt(100) + 1;
        int chute;
        do {
            System.out.print("Adivinhe o número (1-100): ");
            chute = sc.nextInt();
            if(chute > numero) System.out.println("Muito alto!");
            else if(chute < numero) System.out.println("Muito baixo!");
            else System.out.println("Acertou!");
        } while(chute != numero);
    }

    // 11) Sorteio entre 10 e 29
    static void exercicio11() {
        Random rand = new Random();
        int n;
        do {
            System.out.print("Digite um número entre 10 e 29 (9 para sair): ");
            n = sc.nextInt();
            if(n == 9) break;
            int sorteio = rand.nextInt(20) + 10;
            if(n == sorteio)
                System.out.println("PARABÉNS! Você acertou!");
            else
                System.out.println("QUE PENA. O número era " + sorteio);
        } while(n != 9);
    }

    // 12) Ordenar 3 números
    static void exercicio12() {
        int[] nums = new int[3];
        for(int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Ordem (C para crescente, D para decrescente): ");
        char ordem = sc.next().toUpperCase().charAt(0);
        Arrays.sort(nums);
        if(ordem == 'D')
            for(int i = 2; i >= 0; i--) System.out.print(nums[i] + " ");
        else
            for(int i = 0; i < 3; i++) System.out.print(nums[i] + " ");
        System.out.println();
    }

    // 13) Contar vogais e consoantes
    static void exercicio13() {
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();
        int vogais = 0, consoantes = 0;
        for(char c : palavra.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                if("aeiou".indexOf(c) >= 0) vogais++;
                else consoantes++;
            }
        }
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }

    // 14) Validador de senha
    static void exercicio14() {
        System.out.print("Nome: ");
        String nome = sc.nextLine().toLowerCase();
        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine().toLowerCase();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        boolean tamanho = senha.length() >= 8;
        boolean caractere = senha.contains("@") || senha.contains("!") || senha.contains("#");
        boolean primeiraLetra = senha.charAt(0) != nome.charAt(0) && senha.charAt(0) != sobrenome.charAt(0);
        boolean contemNome = !(senha.toLowerCase().contains(nome) || senha.toLowerCase().contains(sobrenome));

        if(tamanho && caractere && primeiraLetra && contemNome)
            System.out.println("Atende critérios");
        else
            System.out.println("Não atende critérios");
    }

    // 15) Função cálculo
    static void exercicio15() {
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        double resultado;
        if(n1 > n2) {
            resultado = n1 * n2;
            System.out.println("Condição: n1 > n2 → multiplicação");
        } else if(n1 < n2) {
            resultado = n1 / n2;
            System.out.println("Condição: n1 < n2 → divisão");
        } else {
            resultado = n1 + n2;
            System.out.println("Condição: n1 = n2 → soma");
        }
        System.out.println("Resultado: " + resultado);
    }
}