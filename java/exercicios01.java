
import java.util.Scanner;

public class exercicios01 {
     public static void main(String[] args) {
        double nota_final;
        Scanner s = new Scanner (System.in);
        System.out.println("informe sua nota final:");
        nota_final = s.nextDouble();
        //menor que 6 e maior que 4
        if (nota_final < 6 && nota_final > 4);{
            System.out.println("precisa fazer prova substitutiva");
        } 
        else if (nota_final > 6); 
        {
            System.out.println("aprovado");

        } 
        else{
            System.out.println("reprovado");

        }
     }
}
