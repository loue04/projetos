public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        System.out.println("Potência de 2: " + Math.pow(num, 2));
        System.out.println("Potência de 4: " + Math.pow(num, 4));
        System.out.println("Potência de 6: " + Math.pow(num, 6));
        System.out.println("Potência de 8: " + Math.pow(num, 8));
        System.out.println("Potência de 10: " + Math.pow(num, 10));
        sc.close();
    }
}