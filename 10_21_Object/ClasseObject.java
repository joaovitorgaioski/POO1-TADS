public class ClasseObject {
    public static void main(String[] args) {

        // Exibindo paises e suas características
        for (Pais pais : Pais.values()) {
            System.out.println("-----==========-----");
            System.out.println("Nome: " + pais.getNome());
            System.out.println("Sigla: " + pais.getSigla());
            System.out.println("Continente: " + pais.getContinente());
        }
    }
}
