public class App {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo a Cafeteria Bom Jesus!");

        ClienteFiliado cliente1 = new ClienteFiliado("João Silva");
        ClienteNaoFiliado cliente2 = new ClienteNaoFiliado("Maria Santos");

        cliente1.realizarCadastro();
        cliente1.fazerPedidos();
        cliente1.exibirConta();

        linhaHorizontal();

        cliente2.realizarCadastro();
        cliente2.fazerPedidos();
        cliente2.exibirConta();
    }

    public static void linhaHorizontal() {
        System.out.println("\n--" + "=".repeat(40) + "-\n");
    }
}