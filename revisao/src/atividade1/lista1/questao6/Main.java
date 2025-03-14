package lista1.questao6;

// Registro de Veículos: Um departamento de trânsito precisa de um sistema para registrar veículos. 
// Desenvolva classe Veiculo com atributos para a placa, marca e ano. Registre três veículos diferentes e apresente seus dados.

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("YZO1807", "Kwid", 2007);
        Veiculo veiculo2 = new Veiculo("MZD0710", "Civic", 2024);
        Veiculo veiculo3 = new Veiculo("PAL1035", "Hb20", 2022);

        veiculo1.exibirVeiculo();
        System.out.println();

        veiculo2.exibirVeiculo();
        System.out.println();

        veiculo3.exibirVeiculo();
    }
}
