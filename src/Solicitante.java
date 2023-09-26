import java.util.ArrayList;

public class Solicitante extends Usuario implements VisualizadorOrdem, CriadorOrdem,EditorOrdem{

    public Solicitante(String cpf, String nome) {
        super(cpf, nome);
    }

    ArrayList<OrdemDeServico> minhasOrdens = new ArrayList<OrdemDeServico>();

    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        GerenciadorOrdens.ordens.add(ordem);
        this.minhasOrdens.add(ordem);
    }

    @Override
    public void editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        System.out.println("Editando");
        OrdemDeServico antiga = GerenciadorOrdens.buscarOrdem(numeroOrdem);
        System.out.println("...");
        int posicao = GerenciadorOrdens.ordens.indexOf(antiga);
        GerenciadorOrdens.ordens.set(posicao, ordem);
        System.out.println("Concluido");
    }

    @Override
    public void verOrdens() {
        for (OrdemDeServico ordem : this.minhasOrdens) {
            if (ordem instanceof OrdemInstalacao) {
                OrdemInstalacao ordemInstalacao = (OrdemInstalacao) ordem;
                ordemInstalacao.mostrarDados();
            } else if (ordem instanceof OrdemManutencao) {
                OrdemManutencao ordemManutencao = (OrdemManutencao) ordem;
                ordemManutencao.mostrarDados();
            }
        }
    }
}
