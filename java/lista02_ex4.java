import java.util.Scanner;

public class lista02_ex4 {
    public static void main(String[] args) {
        Scanner s = new scanner (system.in);

        System.out.println("digite a altura:");
        double h = s.nextDouble();
        
        System.out.println("digite seu sex M/F:");
        char sexo = s.next();

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * h) - 58;

        } else {
            pesoIdeal = (62.1 * h) - 44.7;
        }

        System.out.println("peso ideal: %.2f kg%n", pesoIdeal);


    }
}
