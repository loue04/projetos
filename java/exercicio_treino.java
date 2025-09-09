import java.util.Scanner;

public class exercicio_treino {
    public static boolean triangulo(double A, double B, double C) {
        return A < B + C && B < A + C && C < A + B;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao;
    do {
       System.out.println("\n---menu---");
       System.out.println("1 - verificar tipo de triangulo");
       System.out.println("0 - sair");
       System.out.println("escolha uma opcao:");
       
       switch (opcao) {
        case 1: 
         System.out.print("digite o valor do lado A");
        double ladoA = sc.nextDouble();
        System.err.println("digite o valor do lado B");
        double ladoB = sc.nextDouble();
        System.out.println("digite o valor do lado C");
        double ladoC = sc.nextDouble();

        if (triangulo(ladoA, ladoB, ladoC)){
            if (A == B && B == C){
                System.out.println("triangulo equilatero");
            } else if (A == B || B == C || A == C){
                System.out.println("triangulo isosceles");
            } else {
                System.out.println("triangulo escaleno");
            }
        }
             else {
                System.out.println("os valores nao compoe um triangulo");

             }
             break;
             case 0:
                System.out.println("saindo...");
                break;
                default:
                    System.out.println("opcao invalida");}
    } while (opcao != 0);
    sc.close();


        }
    }
    