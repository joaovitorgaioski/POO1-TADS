public class ClienteNaoFiliado extends Cliente {

    // Construtores
    public ClienteNaoFiliado() {
    }

    public ClienteNaoFiliado(String nome) {
        super(nome);
    }

    // Métodos especializados
    @Override
    public String getTipoCliente() {
        return "Cliente não filiado (sem desconto)";
    }
}