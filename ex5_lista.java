import java.util.Scanner;
public class ex5_lista {         
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Exercício 1
    
        String[][] pedidos = cadastrarPedidos();

        System.out.print("\nDigite o número do pedido que deseja consultar: ");
        String codigo = sc.nextLine();

        consultarPedido(pedidos, codigo);

        // Exercício 2
      
        System.out.print("\nDigite o mês (1 a 12): ");
        int mes = sc.nextInt();

        System.out.print("Digite o tipo de retorno (1 = nome completo, 2 = abreviação): ");
        int tipo = sc.nextInt();

        String resultadoMes = converterMes(mes, tipo);
        System.out.println("Resultado: " + resultadoMes);

        sc.close();
    }

    // Exercício 1 - cadastra os pedidos na matriz

    public static String[][] cadastrarPedidos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pedidos deseja cadastrar? ");
        int qtd = Integer.parseInt(sc.nextLine());

        
        String[][] pedidos = new String[qtd][5];

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCadastro do pedido " + (i + 1));

            System.out.print("Código do pedido: ");
            pedidos[i][0] = sc.nextLine();

            System.out.print("Nome do cliente: ");
            pedidos[i][1] = sc.nextLine();

            System.out.print("Cor principal: ");
            pedidos[i][2] = sc.nextLine();

            System.out.print("Cor secundária: ");
            pedidos[i][3] = sc.nextLine();

            System.out.print("Cor complementar: ");
            pedidos[i][4] = sc.nextLine();
        }

        return pedidos;
    }

    // Exercício 1 - consulta um pedido pelo código
    
    public static void consultarPedido(String[][] pedidos, String codigo) {

        boolean encontrado = false;

        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i][0].equals(codigo)) {
                System.out.println("\n=== Pedido Encontrado ===");
                System.out.println("Número do pedido: " + pedidos[i][0]);
                System.out.println("Cliente: " + pedidos[i][1]);
                System.out.println("Cor principal: " + pedidos[i][2]);
                System.out.println("Cor secundária: " + pedidos[i][3]);
                System.out.println("Cor complementar: " + pedidos[i][4]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nPedido não encontrado!");
        }
    }

    // Exercício 2 - Converte mês
   
    public static String converterMes(int mes, int tipo) {

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (mes < 1 || mes > 12) {
            return "Mês inválido!";
        }

        String nome = meses[mes - 1];

        if (tipo == 1) {
            return nome;   
        } else if (tipo == 2) {
            return nome.substring(0, 3);  
        } else {
            return "Tipo inválido!";
        }
    }
}


