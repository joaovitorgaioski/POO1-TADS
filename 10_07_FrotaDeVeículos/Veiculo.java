public abstract class Veiculo {
    // Atributos
    private String marca, modelo, placa;
    private int quilometragem;
    protected double litrosConsumidos;

    // Construtores
    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String placa, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }

    // Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public int getQuilometragem() {
        return this.quilometragem;
    }

    // Setters
    public void setMarca(String marca) {
        if (!marca.isEmpty() && marca != "" && marca != null) {
            this.marca = marca;
        } else {
            System.out.println("Erro: nome inválido");
        }
    }

    public void setModelo(String modelo) {
        if (!modelo.isEmpty() && modelo != "" && modelo != null) {
            this.modelo = modelo;
        } else {
            System.out.println("Erro: nome inválido");
        }
    }

    public void setPlaca(String placa) {
        if (!placa.isEmpty() && placa != "" && placa != null) {
            this.placa = placa;
        } else {
            System.out.println("Erro: nome inválido");
        }
    }

    public void setQuilometragem(int quilometragem) {
        if (quilometragem >= 0) {
            this.quilometragem = quilometragem;
        } else {
            System.out.println("Erro: quilometragem inválida");
        }
    }

    // Métodos
    public void exibirStatus() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Quilometragem: " + getQuilometragem() + " km rodados");
    }

    public void exibirStatusConcatenado() {
        System.out.println(getMarca() + " , " + getModelo() + " , " + getPlaca() + " , " + getQuilometragem() + " km");
    }

    public void incrementarQuilometragem(int kmRodados) {
        if (kmRodados >= 0) {
            this.quilometragem += kmRodados;
        } else {
            System.out.println("Erro: quilometragem inserida inválida");
        }
    }

    // Usei um método abstrato para forçar o método percorrer() nas filhas. As
    // filhas apenas precisam da quantidade de km rodados, o valor km/litro é
    // especializado
    public abstract void percorrer(int kmRodados);
}
