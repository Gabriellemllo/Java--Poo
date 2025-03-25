package lista1.questao9;

// Gerenciamento de Pacientes em uma Clínica: Uma clínica médica precisa de um sistema para manter registros de pacientes. 
// Desenvolva uma classe Paciente com atributos para nome, idade e diagnóstico. 
// Registre três pacientes e mostre suas informações.

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Lucas", 7, "Gripe");
        Paciente paciente2 = new Paciente("Gabrielle", 18, "Dor de cabeça");
        Paciente paciente3 = new Paciente("Pietro", 15, "Febre");

        try {
            paciente1.setIdade(0);
        } catch (Exception e) {
            System.out.println("A idade não pode ser negativa");
        }

        try {
            paciente2.setIdade(0);
        } catch (Exception e) {
            System.out.println("A idade não pode ser negativa");
        }

        try {
            paciente3.setIdade(0);
        } catch (Exception e) {
            System.out.println("A idade não pode ser negativa");
        }
        
        paciente1.exibirPaciente();
        paciente2.exibirPaciente();
        paciente3.exibirPaciente();
    }
    
}
