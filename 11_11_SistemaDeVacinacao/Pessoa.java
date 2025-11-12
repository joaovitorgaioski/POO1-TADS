
public class Pessoa {

    //Atributos
    private String nome;
    private String cpf;

    //Construtores
    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("Erro: CPF out of length.");
        }
    }
}
