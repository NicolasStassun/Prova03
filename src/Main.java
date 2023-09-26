import java.util.ArrayList;

public class Main {

    static GerenciadorOrdens gerenciadorOrdens = new GerenciadorOrdens();

    public static void main(String[] args) {

         Solicitante usuario1 = new Solicitante("1", "João");
         Atendente usuario2 = new Atendente("2", "Maria");
         Administrador usuario3 = new Administrador("3", "Paulo");
         Relatorio relatorio = new Relatorio();

         OrdemDeServico ordem1 = new OrdemInstalacao(1, "Instalação de Internet", "Em andamento", usuario1, 13022006);
         OrdemDeServico ordem2 = new OrdemManutencao(2, "Manutenção de Computador", "Em andamento", "Computador", 13022006);
         OrdemDeServico ordem3 = new OrdemInstalacao(3, "Instalação de Jogos", "Em andamento", usuario3, 13022006);
         OrdemDeServico ordem4 = new OrdemManutencao(4, "Manutenção de Postes", "Em andamento", "Postes", 13022006);

         usuario1.criarOrdem(ordem1);
         usuario2.criarOrdem(ordem2);
         usuario3.criarOrdem(ordem3);
         usuario1.criarOrdem(ordem4);

        for (OrdemDeServico ordem:
             GerenciadorOrdens.ordens) {
            relatorio.gerarRelatorio(ordem);
        }

        ordem1.atualizarStatus("Concluído");
        ordem2.atualizarStatus("Concluído");
        ordem3.atualizarStatus("Atrasado");
        ordem4.atualizarStatus("Atrasado");

        for (OrdemDeServico ordem:
             GerenciadorOrdens.ordens) {
            relatorio.gerarRelatorio(ordem);
        }

        usuario1.verOrdens();
        usuario2.verOrdens();
        usuario3.verOrdens();

        usuario1.editarOrdem(1,new OrdemInstalacao(1, "Editada", "daasdadsasd", usuario1, 13022006));

        usuario1.verOrdens();
        usuario2.verOrdens();
        usuario3.deletarOrdem(3);
        usuario3.verOrdens();

        System.out.println("\n");
        System.out.println("Gerenciador de Ordens");
        System.out.println("\n");



        gerenciadorOrdens.criarOrdem(new OrdemInstalacao(5, "Cinco", "Em andamento", usuario1, 13022006));
        gerenciadorOrdens.criarOrdem(new OrdemManutencao(6, "Six", "Em andamento", "Computador", 13022006));

        System.out.println("\n");
        System.out.println("Ver Ordens");
        System.out.println("\n");

        gerenciadorOrdens.verOrdens();

        System.out.println("\n");
        System.out.println("Deletar Ordem");
        System.out.println("\n");

        gerenciadorOrdens.deletarOrdem(5);

        System.out.println("\n");
        System.out.println("Mostrar Dados");
        System.out.println("\n");

        gerenciadorOrdens.mostrarDados();

    }

}
