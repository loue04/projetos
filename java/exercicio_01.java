import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua nota final: ");
        double nota = sc.nextDouble();
        if (nota < 6 && nota > 4) {
            System.out.println("Precisa fazer prova substitutiva");
        } else if (nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}