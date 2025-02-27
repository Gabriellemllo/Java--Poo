public class App {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Matemática", "Iago","2 ANOS");
       
        System.out.println("O nome da disciplina é: " + disciplina.nome);
        System.out.println("O nome do Professor é: " + disciplina.professor);
        System.out.println("O período letivo da disciplina é: " + disciplina.periodoLetivo);
    }
}
