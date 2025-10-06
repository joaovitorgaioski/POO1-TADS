import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Caminhao> caminhoes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opcao = 1;

        Caminhao caminhao1 = new Caminhao("Volvo", "FMX MAX", "KLEQ82130", 0, 58000);

        while (opcao != 0) {
            linhaHorizontal();
            System.out.println(
                    "O que deseja fazer? (0) - SAIR\n(1) - Cadastrar veículo\t(2) - Status do veículo\n(3) - Listar veículos\t(4) - Incrementar quilometragem");
            opcao = scan.nextInt();
            linhaHorizontal();

            switch (opcao) {
                case 1:
                    carros.add(new Carro());
                    System.out.print("Marca: ");
                    carros.get(0).setMarca(scan.next());
                    System.out.print("Modelo: ");
                    carros.get(0).setModelo(scan.next());
                    System.out.print("Placa: ");
                    carros.get(0).setPlaca(scan.next());
                    System.out.print("Quilometragem: ");
                    carros.get(0).setQuilometragem(scan.nextInt());
                    System.out.print("Capacidade de passageiros: ");
                    carros.get(0).setCapacidadePassageiros(scan.nextInt());
                    break;

                case 2:
                    carros.get(0).exibirStatus();
                    break;

                case 4:
                    System.out.println("Quantos quilómetros o carro andou?");
                    carros.get(0).setQuilometragem(scan.nextInt());
                    System.out.println("Nova quilometragem: " + carros.get(0).getQuilometragem() + " km");
                    break;

                default:
                    System.out.println("Erro: selecione uma opção válida");
                    break;
            }
        }
    }

    public static void linhaHorizontal() {
        System.out.println("---==========---");
    }
}