package aula1.aula6;

public class Main {
    public static void main(String[] args) {
        Musico musico1 = new Musico("João", 25, 10, "Guitarra");
        Responsavel responsavel1 = new Responsavel("Carlos", "Gerente", musico1);
        musico1.exibirNomeIdade();
        musico1.realizarApresentacao();
        responsavel1.acompanharArtista(musico1);
        
        
        // Criando um objeto do tipo Artista (não é possível, pois é uma classe abstrata)
        // Artista artista = new Artista("Maria", 30);
        
        // Criando um objeto do tipo Musico
    }
}
