import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opcao = -1;
        int indice = -1;

        System.out.println("Seja bem-vindo a Cafeteria Bom Jesus!");

        while (opcao != 0) {
            linhaHorizontal();
            System.out.println(
                    "O que desejas fazer?\n(1) - Cadastrar cliente comum\t\t(2) - Cadastrar cliente filiado\n(3) - Realizar pedido\t\t\t(0) - Sair");
            opcao = scan.nextInt();
            linhaHorizontal();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo.");
                    break;

                case 1:
                    indice++;
                    clientes.add(new ClienteNaoFiliado("Usuário Comum"));
                    clientes.get(indice).realizarCadastro();
                    break;

                case 2:
                    indice++;
                    clientes.add(new ClienteFiliado("Usuário Filiado"));
                    clientes.get(indice).realizarCadastro();
                    break;

                case 3:
                    if (clientes.isEmpty()) {
                        System.out.println("Erro: não há clientes cadastrados.");
                    } else {
                        System.out.println("Qual cliente gostaria de realizar o pedido?");
                        listarClientes(clientes);
                        opcao = scan.nextInt();
                        clientes.get(opcao).fazerPedido();
                        clientes.get(opcao).exibirConta();
                    }
                    break;

                default:
                    System.out.println("Erro: escolha uma opção válida.");
                    break;
            }
            opcao = -1;
        }
        scan.close();
    }

    // Alguns métodos estáticos que julguei serem úteis

    public static void listarClientes(ArrayList<Cliente> clientes) {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i + " - " + clientes.get(i).getNome() + "\t" + clientes.get(i).getTipoCliente());
        }
    }

    public static void linhaHorizontal() {
        System.out.println("\n--" + "=".repeat(40) + "--\n");
    }
}