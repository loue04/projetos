
import java.util.Scanner;

public class exemplo_tabuada {
    public static void main(String[] args) {
      
        /*divisão de um problema em partes:
        passo 1: definir as variaveis e seus tipos
        passo 2: atribuir valores as variaveis
        passo 3: realizar os cálculos
        passo 4: exibir os resultados*/

        int num;
       Scanner s = new Scanner(System.in);
       System.out.print("Digite um número para ver a tabuada:");
    num = s.nextInt();
    System.out.println("Tabuada do " + num);
    for (int i = 0; i < 10; i++) {
        System.out.println(num + "X" + i + "=" + (num * i));


    }

    s.close();
    }

}