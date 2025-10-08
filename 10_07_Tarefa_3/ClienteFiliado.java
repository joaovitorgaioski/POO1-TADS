public class ClienteFiliado extends Cliente {

    // Construtores
    public ClienteFiliado() {
    }

    public ClienteFiliado(String nome, int tipoFiliacao) {
        super(nome, tipoFiliacao);
    }

    // Métodos especializados
    @Override
    public void calcularDesconto() {
        this.contaFinal = this.conta * 0.9; // 10% de desconto
    }

    @Override
    public String getTipoCliente() {
        return "Cliente Filiado (10% de desconto)";
    }

    @Override
    public void exibirConta() {
        calcularDesconto();
        super.exibirConta();
    }
}