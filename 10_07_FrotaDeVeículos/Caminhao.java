public class Caminhao extends Veiculo {
    // Atributos
    private int capacidadeCarga;

    // Construtores
    public Caminhao() {
    }

    public Caminhao(String marca, String modelo, String placa, int quilometragem, int capacidadeCarga) {
        super(marca, modelo, placa, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Getters
    public int getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    // Setters
    public void setCapacidadeCarga(int capacidadeCarga) {
        if (capacidadeCarga >= 0) {
            this.capacidadeCarga = capacidadeCarga;
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
        System.out.println("Capacidade de carga: " + getCapacidadeCarga() + " kilos");
    }

    @Override
    public void exibirStatusConcatenado() {
        System.out.println(getMarca() + " " + getModelo() + " , " + getPlaca() + " , " + getQuilometragem()
                + " km rodados , " + getCapacidadeCarga() + " kg suportados.");
    }

    @Override
    public void percorrer(int kmRodados) {
        this.litrosConsumidos = kmRodados / 3;
        System.out.println("Quantidade de litros consumidos: " + this.litrosConsumidos);
    }
}
