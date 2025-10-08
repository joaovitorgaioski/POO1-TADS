public class App {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo a Cafeteria Bom Jesus!");

        ClienteFiliado cliente1 = new ClienteFiliado("João Silva", 1);
        ClienteNaoFiliado cliente2 = new ClienteNaoFiliado("Maria Santos", 2);

        cliente1.realizarCadastro();
        cliente1.fazerPedidos();
        cliente1.exibirConta();

        System.out.println("\n" + "=".repeat(40) + "\n");

        cliente2.realizarCadastro();
        cliente2.fazerPedidos();
        cliente2.exibirConta();
    }
}