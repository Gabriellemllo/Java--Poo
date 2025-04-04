package lista1.questao12;

// Classe SessaoCinema Um cinema busca melhorar a gestão de suas sessões e ingressos vendidos. 
// A ideia é ter um sistema que permita controlar a venda e cancelamento de ingressos, 
// além de alterar o horário das sessões e exibir informações relevantes sobre elas. 
// Para isso, implemente a classe SessaoCinema com atributos filme (String), horario (String), capacidadeTotal (int) 
// e ingressosVendidos (int).

// Métodos:
// venderIngresso(): diminui a capacidade total e aumenta os ingressos vendidos, se houver lugares disponíveis.
// cancelarIngresso(): aumenta a capacidade total e diminui os ingressos vendidos, se possível.
// exibirInfoSessao(): mostra informações da sessão e quantos lugares ainda estão disponíveis.
// alterarHorario(String novoHorario): modifica o horário da sessão.

public class Main {
    public static void main(String[] args) {
        SessaoCinema sessao1 = new SessaoCinema("velozes e furiosos", "20:00", 100);
        SessaoCinema sessao2 = new SessaoCinema("Avatar: O Caminho da Água", "18:00");
        SessaoCinema sessao3 = new SessaoCinema("Como eu era antes de voce", "22:00", 120);

        System.out.println("Informações Iniciais");
        sessao1.exibirInfoSessao();
        sessao2.exibirInfoSessao();
        sessao3.exibirInfoSessao();

        System.out.println(" Venda de Ingressos");
        sessao1.venderIngresso();
        sessao2.venderIngresso();
        sessao3.venderIngresso();
        sessao1.exibirInfoSessao();
        sessao2.exibirInfoSessao();
        sessao3.exibirInfoSessao();

        System.out.println("Cancelamento de Ingressos");
        sessao1.cancelarIngresso();
        sessao2.cancelarIngresso();
        sessao3.cancelarIngresso();
        sessao1.exibirInfoSessao();
        sessao2.exibirInfoSessao();
        sessao3.exibirInfoSessao();

        System.out.println("Alteração de Horários");
        sessao1.alterarHorario("21:00");
        sessao2.alterarHorario("19:00");
        sessao3.alterarHorario("23:00");
        sessao1.exibirInfoSessao();
        sessao2.exibirInfoSessao();
        sessao3.exibirInfoSessao();

        try {
            sessao1.setCapacidadeTotal(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir a capacidade total: ");
        }

        sessao1.exibirInfoSessao();
    }
}