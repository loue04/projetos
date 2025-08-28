
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // limpar buffer
        System.out.print("Gênero: ");
        String genero = sc.nextLine();
        System.out.print("Cor favorita: ");
        String cor = sc.nextLine();
        System.out.print("Pratica esportes? ");
        String esporte = sc.nextLine();
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Gênero: " + genero + ", Cor favorita: " + cor + ", Esportes: " + esporte);
        sc.close();
    }
}