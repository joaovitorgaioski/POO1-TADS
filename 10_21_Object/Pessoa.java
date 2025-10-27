public class Pessoa {
    private String nome, idade, cpf;

    public Pessoa(String nome, String idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Pessoa outraPessoa = (Pessoa) obj;
        return nome.equals(outraPessoa.nome) && idade.equals(outraPessoa.idade) && cpf.equals(outraPessoa.cpf);
    }
}
