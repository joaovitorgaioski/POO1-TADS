public enum Cardapio {
    PAO(1), COXINHA(2), RISSOLES(3), KIBE(4), EMPADAO(5), PASTEL(6), CAFE(7), COCA_COLA(8);

    private int valor;

    Cardapio(int valor) {
        this.valor = valor;
    }

    public int getCardapio() {
        return this.valor;
    }
}