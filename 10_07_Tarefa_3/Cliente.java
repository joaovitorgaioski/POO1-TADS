
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Cliente {
    protected Scanner scan = new Scanner(System.in);
    protected ArrayList<String> listaPedidos = new ArrayList<>();
    protected String nome;
    protected int tipoFiliacao;
    protected double conta;
    protected double contaFinal;

    // Construtores
    public Cliente() {
    }

    public Cliente(String nome, int tipoFiliacao) {
        this.nome = nome;
        this.tipoFiliacao = tipoFiliacao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getTipoFiliacao() {
        return tipoFiliacao;
    }

    public double getConta() {
        return conta;
    }

    public double getContaFinal() {
        return contaFinal;
    }

    // Setters
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Esse nome não é válido.");
        }
    }

    public void setTipoFiliacao(int tipoFiliacao) {
        if (tipoFiliacao == 1 || tipoFiliacao == 2) {
            this.tipoFiliacao = tipoFiliacao;
        } else {
            System.out.println("Escolha uma opção válida!");
        }
    }

    // Métodos
    public void realizarCadastro() {
        System.out.println("Olá, qual o seu nome?");
        setNome(scan.nextLine());

        System.out.println(getNome() + ", você é cliente filiado?\n1 - Sim\t2 - Não");
        setTipoFiliacao(scan.nextInt());
    }

    public void fazerPedidos() {
        int pedido = -1;

        while (pedido != 0) {
            System.out.println("1 - Pão (R$0.50)\t2 - Coxinha (R$4.50)\t3 - Bolo de Chocolate (R$5.00)\n"
                    + "4 - Café (R$3.00)\t5 - Rissole (R$5.00)\t6 - Sonho Pequeno (R$1.00)\n0 - SAIR");
            pedido = scan.nextInt();

            processarPedido(pedido);
        }
        System.out.println("Pedido finalizado com sucesso!");
    }

    protected void processarPedido(int pedido) {
        switch (pedido) {
            case 1:
                listaPedidos.add("Pão R$0.50");
                conta += 0.5;
                break;
            case 2:
                listaPedidos.add("Coxinha R$4.50");
                conta += 4.5;
                break;
            case 3:
                listaPedidos.add("Bolo de Chocolate R$5.00");
                conta += 5;
                break;
            case 4:
                listaPedidos.add("Café R$3.00");
                conta += 3;
                break;
            case 5:
                listaPedidos.add("Rissole R$5.00");
                conta += 5;
                break;
            case 6:
                listaPedidos.add("Sonho Pequeno R$1.00");
                conta += 1;
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public abstract void calcularDesconto();

    public abstract String getTipoCliente();

    public void exibirConta() {
        System.out.println("-----=====-----");
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipoCliente());
        System.out.println("Total: R$" + getConta());
        System.out.printf("Total a pagar: R$%.2f\n", getContaFinal());
        System.out.println("Pedidos:");

        for (int i = 0; i < this.listaPedidos.size(); i++) {
            System.out.println("\t" + this.listaPedidos.get(i));
        }
        System.out.println("-----=====-----");
    }

}