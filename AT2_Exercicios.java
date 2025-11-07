public class AT2_Exercicios {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("=== AT2 - EXERCÍCIOS 06/11 ===\n");
        System.out.println("1 - Análise de Preços");
        System.out.println("2 - Controle de Faltas");
        System.out.print("\nEscolha qual exercício executar (1 ou 2): ");
        int opcao = s.nextInt();
        
        if (opcao == 1) {
            exercicio1();
        } else if (opcao == 2) {
            exercicio2();
        } else {
            System.out.println("Opção inválida!");
        }
        
        s.close();
    }
    
    // ========== EXERCÍCIO 1 - Análise de Preços ==========
    public static void exercicio1() {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Quantos preços deseja informar? ");
        int quantidade = s.nextInt();
        
        double[] precos = new double[quantidade];
        
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Informe o preço " + (i + 1) + ": R$ ");
            precos[i] = s.nextDouble();
        }
        
        double menor = precos[0];
        double maior = precos[0];
        double soma = 0;
        
        for (int i = 0; i < precos.length; i++) {
            if (precos[i] < menor) {
                menor = precos[i];
            }
            if (precos[i] > maior) {
                maior = precos[i];
            }
            soma += precos[i];
        }
        
        double media = soma / precos.length;
        
        System.out.println("\n--- ANÁLISE DOS PREÇOS ---");
        System.out.printf("Menor preço: R$ %.2f\n", menor);
        System.out.printf("Maior preço: R$ %.2f\n", maior);
        System.out.printf("Média dos preços: R$ %.2f\n", media);
        
        s.close();
    }
    
    // ========== EXERCÍCIO 2 - Controle de Faltas ==========
    public static void exercicio2() {
        Scanner s = new Scanner(System.in);
        
        int[][] alunos = new int[5][2]; 
        
        System.out.println("=== CADASTRO DE ALUNOS ===\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.print("  Informe o RA: ");
            alunos[i][0] = s.nextInt();
            
            System.out.print("  Informe a quantidade de faltas: ");
            alunos[i][1] = s.nextInt();
            System.out.println();
        }
        
        System.out.println("   RELATÓRIO DE FALTAS");
       
        
        for (int i = 0; i < 5; i++) {
            int ra = alunos[i][0];
            int faltas = alunos[i][1];
            String situacao;
            
            if (faltas > 20) {
                situacao = "REPROVADO POR FALTAS";
            } else {
                situacao = "Aprovado";
            }
            
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.println("  RA: " + ra);
            System.out.println("  Faltas: " + faltas);
            System.out.println("  Situação: " + situacao);
            
        }
        
        s.close();
    }
}
    

