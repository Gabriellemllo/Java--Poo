package lista1.questao5;

// Sistema de Reservas de Hotel: Um hotel quer um sistema simples para gerenciar reservas.
// Elabore uma classe Reserva que contenha o nome do hóspede, o tipo de quarto (simples, duplo, suíte) e o número de noites. 
// Crie três reservas diferentes e exiba as informações.

public class Main {
    public static void main(String[] args) {
        Reserva reserva1 = new Reserva("Carlos", "Simples", (short) 3);
        Reserva reserva2 = new Reserva("Gabi", "Duplo", (short) 5);
        Reserva reserva3 = new Reserva("Pedro", "Suíte", (short) 2);

        reserva1.exibirInformacoes();
        System.out.println();
        reserva2.exibirInformacoes();
        System.out.println();
        reserva3.exibirInformacoes();
        System.out.println();

    }
}
