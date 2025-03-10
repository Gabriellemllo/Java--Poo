package lista1;

//Gestão de Biblioteca: Imagine que você precisa organizar as informações dos livros em uma biblioteca.
// Crie uma classe Livro com atributos para armazenar o título.
// autor e ano de publicação. Em seguida, simule a adição de três livros ao sistema, mostrando suas informações.

public class Biblioteca {
    public String titulo;
    public String autor;
    public int ano;
    

    public Biblioteca(String titulo,  String autor, int ano){
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;

    }
    public void bibliotecaInfo(){
        System.out.println("Título do livro :"+ titulo); 
        System.out.println("Autor : " + autor);
        System.out.println("Ano de publicação" + ano);  
    }

}
