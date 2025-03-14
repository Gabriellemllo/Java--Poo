package lista1.questao2;

public class Main {
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria Yasmim", 10, 5);
        Aluno aluno2 = new Aluno("Maria Gabrielle", 16, 3);
        Aluno aluno3 = new Aluno("Maria Fernamda ", 12, 7);

        System.out.println( "Lista de Alunos:");
        aluno1.exibirAluno();

        System.out.println();
        aluno2.exibirAluno();

        System.out.println();
        aluno3.exibirAluno();

    }
}
