import java.util.Date;

public class OrdemInstalacao extends OrdemDeServico implements Imprimivel {

    public OrdemInstalacao(int numeroOrdem, String descricao, String status, Usuario cliente, int dataInstalacao) {
        super(numeroOrdem, descricao, status);
        this.cliente = cliente;
        this.dataInstalacao = dataInstalacao;
    }

    Usuario cliente;
    int dataInstalacao;

    @Override
    public void mostrarDados() {
        System.out.println("Numero da Ordem: " + this.numeroOrdem);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Status: " + this.status);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Data de Instalação: " + this.dataInstalacao);
    }
}
