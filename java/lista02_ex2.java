import java.util.Scanner;

public class lista02_ex2 {
    public static void main(String[] args) {
        Scanner s = new scanner (system.in);
        System.out.println("matricula do funcionario:");
        int matricula = s.nextInt();

        System.out.println("numeros de horas trabalhadas: ");
        int horas = s.nextInt();

        System.out.println("valor por hroas: ");
        double valorHoras = s.nextDouble();

        System.out.println("mes de referencia:");
        string mes = s.next();

        double salario;
        if (horas <= 200) {
            salario = horas * valorHoras;
        } else {
            int extra = horas - 200;
            salario = (200 * valorHoras) + (extra * valorHoras * 1.5);
        }

        System.out.println("matricula:" + matricula);
        System.out.println("mes:" + mes);
        System.out.println("horas trabalhadas:" + horas);
        System.out.println("salario: R$ %.2f%n", salario);
    }
}