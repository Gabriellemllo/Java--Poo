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

public class SessaoCinema {
    private String filme;
    private String horario;
    private int capacidadeTotal;
    private int ingressosVendidos;

    public SessaoCinema() {
    }

    public SessaoCinema(String filme, String horario, int capacidadeTotal) {
        this.filme = filme;
        this.horario = horario;
        this.capacidadeTotal = capacidadeTotal;
        this.ingressosVendidos = 0;
    }

    public SessaoCinema(String filme, String horario) {
        this.filme = filme;
        this.horario = horario;
        this.capacidadeTotal = 100; // Valor padrão
        this.ingressosVendidos = 0;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        if (capacidadeTotal <= 0) {
            throw new IllegalArgumentException("Capacidade total inválida: " + capacidadeTotal);
        }
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        if (ingressosVendidos < 0) {
            throw new IllegalArgumentException("Número de ingressos vendidos inválido: " + ingressosVendidos);
        }
        this.ingressosVendidos = ingressosVendidos;
    }

    public void venderIngresso() {
        if (ingressosVendidos < capacidadeTotal) {
            ingressosVendidos++;
            System.out.println("Ingresso vendido com sucesso.");
        } else {
            System.out.println("Não há lugares disponíveis para esta sessão.");
        }
    }

    public void cancelarIngresso() {
        if (ingressosVendidos > 0) {
            ingressosVendidos--;
            System.out.println("Ingresso cancelado com sucesso.");
        } else {
            System.out.println("Não há ingressos para cancelar.");
        }
    }

    public void exibirInfoSessao() {
        int lugaresDisponiveis = capacidadeTotal - ingressosVendidos;
        System.out.println("Filme: " + filme);
        System.out.println("Horário: " + horario);
        System.out.println("Ingressos vendidos: " + ingressosVendidos);
        System.out.println("Lugares disponíveis: " + lugaresDisponiveis);
    }

    public void alterarHorario(String novoHorario) {
        this.horario = novoHorario;
        System.out.println("Horário da sessão alterado para: " + novoHorario);
    }
}


