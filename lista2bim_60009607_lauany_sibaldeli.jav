import java.util.*;

public class lista2bim_60009607_lauany_sibaldeli {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opc;

        do {
            System.out.println("===== MENU DE EXERCÍCIOS =====");
            System.out.println("A - Ordenar três inteiros");
            System.out.println("B - Imprimir matriz de Strings");
            System.out.println("C - Ordenar vetor de inteiros");
            System.out.println("D - Somar linhas de matriz");
            System.out.println("E - Substituir letras baseado em ano primo");
            System.out.println("F - Buscar aluno em matriz");
            System.out.println("G - Divisão entre vetores");
            System.out.println("H - Verificar número em vetor (1-100)");
            System.out.println("I - Criar matriz 3x4 com entrada");
            System.out.println("J - Criar matriz 5x4 com números aleatórios");
            System.out.println("K - Meses para nome/abreviação");
            System.out.println("L - Cálculo de desconto");
            System.out.println("M - Sistema pedidos de crochê");
            System.out.println("N - Divisão segura");
            System.out.println("O - Programa livre com 3 funções");
            System.out.println("S - Sair");
            opc = sc.nextLine().toUpperCase();

            switch(opc) {
                case "A": exercicioA(); break;
                case "B": exercicioB(); break;
                case "C": exercicioC(); break;
                case "D": exercicioD(); break;
                case "E": exercicioE(); break;
                case "F": exercicioF(); break;
                case "G": exercicioG(); break;
                case "H": exercicioH(); break;
                case "I": exercicioI(); break;
                case "J": exercicioJ(); break;
                case "K": exercicioK(); break;
                case "L": exercicioL(); break;
                case "M": exercicioM(); break;
                case "N": exercicioN(); break;
                case "O": exercicioO(); break;
                case "S": System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida.");
            }

        } while(!opc.equals("S"));
    }

    // ========== FUNÇÃO A ==========
    public static void exercicioA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite três números inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(ordenar_inteiros(a,b,c));
    }
    public static String ordenar_inteiros(int a, int b, int c) {
        int[] v = {a,b,c};
        Arrays.sort(v);
        return "Números em ordem crescente: " + v[0] + ", " + v[1] + ", " + v[2];
    }

    // ========== FUNÇÃO B ==========
    public static void exercicioB() {
        String[][] m = {{"Ana","João"},{"Maria","Pedro"}};
        imprime_vetor_string(m);
    }
    public static void imprime_vetor_string(String[][] mat) {
        for (String[] linha : mat) {
            for (String v : linha) System.out.print(v + " ");
            System.out.println();
        }
    }

    // ========== FUNÇÃO C ==========
    public static void exercicioC() {
        int[] v = {5,1,9,3};
        v = ordena_vetor(v);
        System.out.println(Arrays.toString(v));
    }
    public static int[] ordena_vetor(int[] v) {
        Arrays.sort(v);
        return v;
    }

    // ========== FUNÇÃO D ==========
    public static void exercicioD() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        somaLinhas(m);
    }
    public static void somaLinhas(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int soma = 0;
            for (int j = 0; j < m[0].length; j++) soma += m[i][j];
            System.out.println("Soma linha " + i + ": " + soma);
        }
    }

    // ========== FUNÇÃO E ==========
    public static void exercicioE() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Ano de nascimento: ");
        int ano = sc.nextInt();
        System.out.println(transformar(nome, ano));
    }
    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) if (n % i == 0) return false;
        return true;
    }
    public static String transformar(String nome, int ano) {
        if (isPrimo(ano)) {
            return nome.replace("A","@").replace("a","@").replace("E","!").replace("e","!");
        } else {
            return nome.replace("E","#").replace("e","#").replace("O","*").replace("o","*");
        }
    }

    // ========== FUNÇÃO F ==========
    public static void exercicioF() {
        String[][] alunos = {
            {"Ana Silva","123"},
            {"Carlos Souza","456"},
            {"Maria Oliveira","789"}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Parte do nome: ");
        String txt = sc.nextLine();
        String[][] r = busca_aluno(alunos, txt);
        imprime_vetor_string(r);
    }
    public static String[][] busca_aluno(String[][] mat, String texto) {
        ArrayList<String[]> lista = new ArrayList<>();
        for (String[] linha : mat) {
            if (linha[0].toLowerCase().contains(texto.toLowerCase())) lista.add(linha);
        }
        return lista.toArray(new String[0][0]);
    }

    // ========== FUNÇÃO G ==========
    public static void exercicioG() {
        int[] v1 = {8,16,24,32,40,48,56,64};
        int[] v2 = {2,4,6,8,10,12,14,16};
        double[] v3 = new double[8];
        for(int i=0;i<8;i++) v3[i] = dividir(v1[i], v2[i]);
        System.out.println(Arrays.toString(v3));
    }
    public static double dividir(double a, double b) {
        if (b==0) return 0;
        return a/b;
    }

    // ========== FUNÇÃO H ==========
    public static void exercicioH() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[50];
        Random r = new Random();
        for(int i=0;i<50;i++) v[i] = r.nextInt(100)+1;
        System.out.print("Número: ");
        int x = sc.nextInt();
        boolean ok = false;
        for(int n:v) if(n==x) ok=true;
        System.out.println(ok?"Está presente":"Não está presente");
    }

    // ========== FUNÇÃO I ==========
    public static void exercicioI() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][4];
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print("Valor ["+i+"]["+j+"]: ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    // ========== FUNÇÃO J ==========
    public static void exercicioJ() {
        double[][] m = new double[5][4];
        Random r = new Random();
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                m[i][j] = r.nextDouble()*100;
                System.out.printf("%.2f ", m[i][j]);
            }
            System.out.println();
        }
    }

    // ========== FUNÇÃO K ==========
    public static void exercicioK() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mês (1-12): ");
        int mes = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo (nome/abrev): ");
        String tipo = sc.nextLine();
        System.out.println(converterMes(mes, tipo));
    }
    public static String converterMes(int m, String t) {
        String[] nome = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        String[] abrev = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        if (t.equalsIgnoreCase("nome")) return nome[m-1];
        else return abrev[m-1];
    }

    // ========== FUNÇÃO L ==========
    public static void exercicioL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Descrição: ");
        String desc = sc.nextLine();
        System.out.print("Preço bruto: ");
        double pb = sc.nextDouble();
        System.out.print("Desconto (%): ");
        double d = sc.nextDouble();
        double pl = pb - (pb*(d/100));
        System.out.println("Nome: "+desc);
        System.out.println("Preço bruto: "+pb);
        System.out.println("Desconto: "+d+"%");
        System.out.println("Preço líquido: "+pl);
    }

    // ========== FUNÇÃO M ==========
    public static void exercicioM() {
        Scanner sc = new Scanner(System.in);
        String[][] pedidos = new String[5][5];
        for(int i=0;i<5;i++){
            System.out.println("Pedido "+(i+1)+":");
            System.out.print("Número: "); pedidos[i][0] = sc.nextLine();
            System.out.print("Cliente: "); pedidos[i][1] = sc.nextLine();
            System.out.print("Cor principal: "); pedidos[i][2] = sc.nextLine();
            System.out.print("Cor secundária: "); pedidos[i][3] = sc.nextLine();
            System.out.print("Cor complementar: "); pedidos[i][4] = sc.nextLine();
        }
        System.out.print("Buscar pedido (número): ");
        String cod = sc.nextLine();
        for(String[] p: pedidos){
            if(p[0].equals(cod)){
                System.out.println(Arrays.toString(p));
            }
        }
    }

    // ========== FUNÇÃO N ==========
    public static void exercicioN() {
        System.out.println("Exemplo: 10 / 2 = " + dividir(10,2));
        System.out.println("Exemplo: 10 / 0 = " + dividir(10,0));
    }

    // ========== FUNÇÃO O ==========
    public static void exercicioO() {
        int[] v = {9,4,7,1,5};
        mostrarVetor(v);
        ordenar(v);
        mostrarVetor(v);
        System.out.println("Soma = " + somar(v));
    }
    public static void mostrarVetor(int[] v){
        System.out.println(Arrays.toString(v));
    }
    public static void ordenar(int[] v){ Arrays.sort(v); }
    public static int somar(int[] v){ int s=0; for(int x:v) s+=x; return s; }
}
