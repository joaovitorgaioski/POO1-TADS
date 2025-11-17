
import java.util.Scanner;

public class Pessoa {
    Scanner scan = new Scanner(System.in);

    private String nome, cpf;

    public Pessoa() {

    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void cadastrar() {
        System.out.println("Nome da pessoa: ");
        setNome(scan.next());
        System.out.println("CPF da pessoa: ");
        setCpf(scan.next());
    }
}
