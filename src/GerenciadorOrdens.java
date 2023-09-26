import java.util.ArrayList;

public class GerenciadorOrdens implements VisualizadorOrdem, CriadorOrdem,RemovedorOrdem,Imprimivel {

     static ArrayList<OrdemDeServico> ordens = new ArrayList<OrdemDeServico>();


    @Override
    public void mostrarDados() {
        for (OrdemDeServico ordem:
                ordens) {
            if (ordem instanceof OrdemInstalacao ordemInstalacao) {
                ordemInstalacao.mostrarDados();
            } else if (ordem instanceof OrdemManutencao ordemManutencao) {
                ordemManutencao.mostrarDados();
            }
        }
    }

    @Override
     public void criarOrdem(OrdemDeServico ordem) {
        ordens.add(ordem);
    }

    @Override
    public void deletarOrdem(int numeroOrdem) {
        OrdemDeServico ordem = buscarOrdem(numeroOrdem);
        ordens.remove(ordem);
    }

    @Override
    public void verOrdens() {
        for (OrdemDeServico ordem : ordens) {
            if (ordem instanceof OrdemInstalacao ordemInstalacao) {
                ordemInstalacao.mostrarDados();
            } else if (ordem instanceof OrdemManutencao ordemManutencao) {
                ordemManutencao.mostrarDados();
            }
        }
    }
    public static OrdemDeServico buscarOrdem(int numeroOrdem){
        for (OrdemDeServico ordemFor:
                ordens) {
            if (numeroOrdem == ordemFor.numeroOrdem){
                return ordemFor;
            }
        }
        return null;
    }

}
