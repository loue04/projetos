public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int valor = sc.nextInt();

        if (valor > 10 && valor < 100) {
            System.out.printf("Potência de 2: %.5f\n", Math.pow(valor, 2));
        } else if (valor < 10 || valor > 100) {
            System.out.printf("Raiz quadrada: %.5f\n", Math.sqrt(valor));
        }

        sc.close();
    }
}