public class App {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Matemática", "Iago","2 ANOS");
       
        System.out.println("O nome da disciplina é: " + disciplina.nome);
        System.out.println("O nome do Professor é: " + disciplina.professor);
        System.out.println("O período letivo da disciplina é: " + disciplina.periodoLetivo);

        Filme filme = new Filme("Avatar", "ação", 3.20);
        System.out.println("O nome do Filme: " + filme.nomeFilme);
        System.out.println("O Gênero do Filme : " + filme.genero);
        System.out.println("A duração do Filme : " + filme.duracao);
          
    }
}
