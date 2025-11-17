
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Objetos
        Scanner scan = new Scanner(System.in);
        Enfermeira enfermeira = new Enfermeira();
        ArrayList<Cidadao> cidadao = new ArrayList<>();

        // Variáveis
        int opcao = -1;
        int indiceCidadao = -1;
        int i;
        String dataDose;

        System.out.println("-----===== Sistema de Vacinação para COVID-19 =====-----");
        enfermeira.cadastrar();
        
        // Menu
        while (opcao != 0) {
            // Exibe as opções para a enfermeira
            Util.linhaHorizontal();
            System.out.println("Opções disponíveis para você, " + enfermeira.getNome() + ":");
            System.out.println("(1) Vacinar Cidadão\n(2) Listar Cidadãos\n(0) Sair");
            opcao = scan.nextInt();
            Util.linhaHorizontal();

            switch (opcao) {
                case 1:
                    // Instancia um novo cidadao
                    indiceCidadao++;
                    cidadao.add(new Cidadao());
                    cidadao.get(indiceCidadao).cadastrar();

                    // Colocando a data das vacinações com base na quantidade de doses ja tomadas
                    Util.linhaHorizontal();
                    System.out.println("Use o padrão 'dia/mês/ano'.");
                    for (i = 0; i < cidadao.get(indiceCidadao).getQntdDoses(); i++) {
                        System.out.print("Data da " + (i + 1) + "ª dose: ");
                        dataDose = scan.next();
                        cidadao.get(indiceCidadao).adicionarDataDose(Util.formatarData(dataDose), i);
                    }

                    // Comparando as duas últimas vezes em que as doses foram tomadas para vacinar (ou não) aquele cidadão
                    if (cidadao.get(indiceCidadao).compararDatasDoses(i - 1)) {
                        System.out.println(
                                "\nO período das duas últimas doses é maior que 4 meses. Você pode ser vacinado!\nVacinado com sucesso!");
                                
                        cidadao.get(indiceCidadao).adicionarDataDose(Util.formatarData(Util.obterDataAtual()), i);
                    } else {
                        System.out.println("\nNão será possível vaciná-lo, o periodo é inferior a 4 meses.");
                    }
                    break;

                case 2:
                    // Listando os cidadãos vacinados
                    for (i = 0; i < cidadao.size(); i++) {
                        System.out.println("Nome: " + cidadao.get(i).getNome());
                        System.out.println("CPF: " + cidadao.get(i).getCpf());
                        for (int i2 = 0; i2 < cidadao.get(i).getQntdDoses(); i2++) {
                            System.out.println("\t" + (i2 + 1) + "ª " + cidadao.get(i).getDataDose(i2));
                        }
                        System.out.println("");
                    }
                    break;

                case 0:
                    break;
            }
        }

        scan.close();
    }
}
