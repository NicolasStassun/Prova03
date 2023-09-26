import java.sql.SQLOutput;
import java.util.Date;

public class OrdemManutencao extends OrdemDeServico implements Imprimivel{

    public OrdemManutencao(int numeroOrdem, String descricao, String status, String equipamento, int dataManutencao) {
        super(numeroOrdem, descricao, status);
        this.equipamento = equipamento;
        this.dataManutencao = dataManutencao;
    }

    String equipamento;
    int dataManutencao;

    @Override
    public void mostrarDados() {
        System.out.println("Numero da Ordem: " + this.numeroOrdem);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Status: " + this.status);
        System.out.println("Equipamento: " + this.equipamento);
        System.out.println("Data de Manutenção: " + this.dataManutencao);
    }
}
