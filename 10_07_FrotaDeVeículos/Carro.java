public class Carro extends Veiculo {
    // Atributos
    private int capacidadePassageiros;

    // Construtores
    public Carro() {
    }

    public Carro(String marca, String modelo, String placa, int quilometragem, int capacidadePassageiros) {
        super(marca, modelo, placa, quilometragem);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    // Getters
    public int getCapacidadePassageiros() {
        return this.capacidadePassageiros;
    }

    // Setters
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        if (capacidadePassageiros >= 0) {
            this.capacidadePassageiros = capacidadePassageiros;
        } else {
            System.out.println("Erro: capacidade inválida");
        }
    }

    // Métodos
    @Override
    public void exibirStatus() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Quilometragem: " + getQuilometragem() + " km rodados");
        System.out.println("Capacidade de passageiros: " + getCapacidadePassageiros());
    }

    @Override
    public double percorrer(int kmRodados) {
        this.litrosConsumidos = kmRodados / 10;
        return this.litrosConsumidos;
    }
}
