public class Administrador extends Usuario implements VisualizadorOrdem, CriadorOrdem,EditorOrdem,RemovedorOrdem{

    public Administrador(String cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        GerenciadorOrdens.ordens.add(ordem);
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
    public void deletarOrdem(int numeroOrdem) {
        OrdemDeServico ordem = GerenciadorOrdens.buscarOrdem(numeroOrdem);
        GerenciadorOrdens.ordens.remove(ordem);
    }

    @Override
    public void verOrdens() {
        for (OrdemDeServico ordem : GerenciadorOrdens.ordens) {
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
