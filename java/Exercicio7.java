
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Maior: " + (num1 > num2));
        System.out.println("Menor: " + (num1 < num2));
        System.out.println("Igual: " + (num1 == num2));
        System.out.println("Diferente: " + (num1 != num2));

        sc.close();
    }
}