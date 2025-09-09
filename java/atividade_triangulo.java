
import java.util.Scanner;

public class atividade_triangulo {
    public static void main(String[] args) {
        
        int A,B ,C;
        String msg = "";
        Scanner s = new Scanner(System.in);

        System.out.println("algritimo para calcular o tipo de triangulo");
        System.out.println("informe o primeiro lado");
        A = s.nextInt();
        System.out.println("informe o segundo lado");
        B = s.nextInt();
        System.out.println("informe o terceiro lado");
        C = s.nextInt();

        if (A < B + C && B < A + C && C < A + B) {

         } if (A == B && B == C) {
            msg = "triangulo equilatero";
         } else if (A == B || B == C || A == C) {
            msg = "triangulo isosceles";
         } else if (A != B && B != C && A != C) {
            msg = "triangulo escaleno";
             
         }
          else {
            msg = "nao é um triangulo";
         }
            System.out.println("resultado:" + msg);
        }
    }
