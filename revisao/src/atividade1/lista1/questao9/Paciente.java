package lista1.questao9;

// Gerenciamento de Pacientes em uma Clínica: Uma clínica médica precisa de um sistema para manter registros de pacientes. 
// Desenvolva uma classe Paciente com atributos para nome, idade e diagnóstico. 
// Registre três pacientes e mostre suas informações.

public class Paciente {
    private String nome;
    private int idade;
    private String diagnostico;

    public Paciente(String nome, int idade, String diagnostico) {
        this.nome = nome;
        this.idade = idade;
        this.diagnostico = diagnostico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade)throws Exception {
        if (idade < 0) {
            throw new Exception();
        }
        this.idade = idade;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

     public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

   public void exibirPaciente() {
        System.out.println("Nome do Paciente: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Diagnóstico: " + getDiagnostico());
    }
}
