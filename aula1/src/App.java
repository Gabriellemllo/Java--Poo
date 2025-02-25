public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "matheus";
        aluno1.altura = 1.75;
        System.out.println("nome do aluno: "+ aluno1.nome);
        System.out.println("altura do aluno:" + aluno1.altura);
        aluno1.nome = "M.chavez";
        System.out.println("nome do aluno: "+ aluno1.nome);
        aluno1.estudar("Progarmação orientada a objeto");
        aluno1.pedirNota("Iago");
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ayla";
        aluno2.altura = 1.70;
        aluno2.estudar("POO");
        aluno2.pedirNota("Iago");









        
    }
}
