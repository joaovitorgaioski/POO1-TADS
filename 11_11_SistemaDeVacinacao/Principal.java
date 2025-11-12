
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Variáveis e objetos
        Scanner scan = new Scanner(System.in);
        Enfermeira enfermeira = new Enfermeira();
        ArrayList<Cidadao> cidadao = new ArrayList<>();
        int opcao = -1;
        int indiceCidadao = 0;

        //Definindo a enfermeira
        System.out.println("Nome da enfermeira:");
        enfermeira.setNome(scan.next());
        System.out.println("CPF da enfermeira:");
        enfermeira.setCpf(scan.next());
        linhaHorizontal();

        //Menu
        System.out.println("--== Sistema de Vacinação para a COVID-19 ==--");
        while (opcao != 0) {
            linhaHorizontal();
            System.out.println("Olá, " + enfermeira.getNome() + ", aqui estão as opções do sitema:\n(1) - Vacinar cidadão\n(2) - Listar cidadãos vacinados\n(3) - Sair");
            opcao = scan.nextInt();
            linhaHorizontal();

            switch (opcao) {
                case 1:
                    indiceCidadao++;
                    System.out.print("---== Vacinando nova pessoa! ==---\nNome: ");
                    cidadao.get(indiceCidadao).setNome(scan.next());
                    System.out.print("CPF: ");
                    cidadao.get(indiceCidadao).setCpf(scan.next());
                    System.out.print("Quantidade de doses já adquiridas: ");
                    cidadao.get(indiceCidadao).setQntdDoses(scan.nextInt());

                    System.out.println("Use o padrão dia-mês-ano.");
                    for(int i = 0; i < cidadao.get(indiceCidadao).getQntdDoses(); i++){
                        System.out.print("Data da " + i + "ª dose: ");
                        cidadao.get(indiceCidadao).

                    }
                    break;

                case 2:
                    break;

                case 3:
                    break;
            }
        }

        scan.close();

    }

    public static void linhaHorizontal() {
        System.out.println("-------===========-------");
    }
}
