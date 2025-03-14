package lista1.questao8;

// Controle de Eventos: Uma organização que promove eventos quer um sistema para gerenciar informações sobre eles. 
// Crie uma classe Evento com atributos para nome do evento, data e local. 
// Organize três eventos diferentes e exiba as informações.

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Wehoo", "12/11/2024", "São Paulo");
        Evento evento2 = new Evento("Rec'n Play", "04/11/2025", "Recife");
        Evento evento3 = new Evento("Campus Party", "05/09/2024", "Recife");

        evento1.exibirEvento();
        System.out.println();

        evento2.exibirEvento();
        System.out.println();

        evento3.exibirEvento();
    }
}
