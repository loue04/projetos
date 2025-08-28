public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a leitura do dia 1: ");
        double inicio = sc.nextDouble();
        System.out.print("Digite a leitura do dia 30: ");
        double fim = sc.nextDouble();

        double consumo = fim - inicio;
        System.out.println("Consumo total: " + consumo + " litros");
        System.out.println("Média diária: " + (consumo / 30) + " litros por dia");

        sc.close();
    }
}