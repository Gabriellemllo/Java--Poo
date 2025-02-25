public class Aluno {
    public String nome;
    public double altura;

    public void estudar(String materia) {
        System.out.println(nome + " está studando a materia" + materia);
    }

    public void pedirNota(String professor) {
        System.out.println(nome + " está pedindo nota ao professor" + professor);
    }
}
