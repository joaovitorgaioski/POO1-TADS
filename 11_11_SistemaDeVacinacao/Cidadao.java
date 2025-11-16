
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Cidadao extends Pessoa {

    private int qntdDoses;
    ArrayList<Calendar> dataDose = new ArrayList<>();

    public Cidadao() {

    }

    public Cidadao(String nome, String cpf, int qntdDoses) {
        super(nome, cpf);
        this.qntdDoses = qntdDoses;
    }

    public int getQntdDoses() {
        return this.qntdDoses;
    }

    public void setQntdDoses(int qntdDoses) {
        this.qntdDoses = qntdDoses;
    }

    @Override
    public void cadastrar() {
        System.out.print("Nome do cidadão: ");
        setNome(scan.next());
        System.out.print("CPF de " + getNome() + ": ");
        setCpf(scan.next());
        System.out.print("Quantidade de doses que" + getNome() + " já tomou: ");
        setQntdDoses(scan.nextInt());
    }

    public void adicionarDataDose(Date dataDose, int indiceDose) {
        this.dataDose.add(Calendar.getInstance());
        this.dataDose.get(indiceDose).setTime(dataDose);
    }

    public boolean compararDatasDoses(int indiceDose) {
        Calendar dataAnterior = dataDose.get(indiceDose - 1);
        Calendar ultimaData = dataDose.get(indiceDose);

        dataAnterior.add(Calendar.MONTH, 4);
        
        return ultimaData.after(dataAnterior);
    }
}