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
    public void exibirStatusConcatenado() {
        System.out.println(getMarca() + " " + getModelo() + " , " + getPlaca() + " , " + getQuilometragem()
                + " km rodados , " + getCapacidadePassageiros() + " espaços disponíveis.");
    }

    @Override
    public void percorrer(int kmRodados) {
        this.litrosConsumidos = kmRodados / 10;
        System.out.println("Quantidade de litros consumidos: " + this.litrosConsumidos);
    }
}
