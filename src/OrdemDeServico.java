public abstract class OrdemDeServico implements Imprimivel{

    public OrdemDeServico(int numeroOrdem, String descricao, String status) {
        this.numeroOrdem = numeroOrdem;
        this.descricao = descricao;
        this.status = status;
    }

    int numeroOrdem;
    String descricao;
    String status;

    @Override
    public void mostrarDados() {
        if (this instanceof OrdemInstalacao){
            OrdemInstalacao ordemInstalacao = (OrdemInstalacao) this;
            ordemInstalacao.mostrarDados();
        } else if (this instanceof OrdemManutencao){
            OrdemManutencao ordemManutencao = (OrdemManutencao) this;
            ordemManutencao.mostrarDados();
        }
    }
    public void atualizarStatus(String novoStatus){
        this.status = novoStatus;
    }
}
