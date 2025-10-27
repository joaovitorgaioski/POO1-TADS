public class ClasseObject {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("João", "18", "123456789");
        Pessoa p2 = new Pessoa("João", "18", "123456789");

        System.out.println(p1.equals(p2));
    }
}

