public class ClienteFiliado extends Cliente {

    // Atributos especializados
    private double contaDescontada;

    // Construtores
    public ClienteFiliado() {
    }

    public ClienteFiliado(String nome) {
        super(nome);
    }

    // Getters
    public double getContaDescontada() {
        return contaDescontada;
    }

    // Métodos especializados
    public void calcularDesconto() {
        this.contaDescontada = this.conta * 0.9; // 10% de desconto
    }

    @Override
    public String getTipoCliente() {
        return "Cliente filiado (10% de desconto)";
    }

    @Override
    public void exibirConta() {
        calcularDesconto();
        super.exibirConta();
        System.out.printf("Total a pagar: R$%.2f\n", getContaDescontada());
        App.linhaHorizontal();
    }
}