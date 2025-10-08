public class ClienteNaoFiliado extends Cliente {

    // Construtores
    public ClienteNaoFiliado() {
    }

    public ClienteNaoFiliado(String nome, int tipoFiliacao) {
        super(nome, tipoFiliacao);
    }

    // Métodos especializados
    @Override
    public void calcularDesconto() {
        this.contaFinal = this.conta; // Sem desconto
    }

    @Override
    public String getTipoCliente() {
        return "Cliente Não Filiado";
    }

    @Override
    public void exibirConta() {
        calcularDesconto();
        super.exibirConta();
    }
}