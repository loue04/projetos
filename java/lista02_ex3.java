import java.util.Scanner;

public class lista02_ex3 {
    public static void main(String[] args) {
        Scanner s = new scanner (system.in);
        System.out.println("digite tres valores diferentes:");

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        inf menor, meio, maior;

        if (a < b && a < c){
            menor = a;
            if (b < c) {
                meio = b; maior = c;
            
            } else {
                meio = c; maior = b;
            } else if (b < a && b < c) {
                menor = b;

                if (a < c) {
                    meio = a; maior = c;
                } else {
                    meio = c; maior = a;
                } else {
                    meio = b; maior = a;

                 }
                 System.out.println("ordem crescente:" + menor + "" + meio +"" + maior);

            }
        }
    }
}