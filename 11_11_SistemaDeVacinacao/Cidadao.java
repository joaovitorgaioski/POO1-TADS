
import java.util.ArrayList;
import java.util.Calendar;


public class Cidadao extends Pessoa {

    private int qntdDoses;
    private ArrayList<Calendar> dataDose = new ArrayList<>();

    public Cidadao() {
    }

    public Cidadao(String nome, String cpf) {
        super(nome, cpf);
    }

    public int getQntdDoses() {
        return this.qntdDoses;
    }

    public void setQntdDoses(int doses) {
        this.qntdDoses = doses;
    }
}
