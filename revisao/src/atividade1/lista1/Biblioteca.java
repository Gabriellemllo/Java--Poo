package lista1;

//Gestão de Biblioteca: Imagine que você precisa organizar as informações dos livros em uma biblioteca.
// Crie uma classe Livro com atributos para armazenar o título.
// autor e ano de publicação. Em seguida, simule a adição de três livros ao sistema, mostrando suas informações.

public class Biblioteca {
    private String titulo;
    private String autor;
    private int ano;
    

    public Biblioteca(String titulo,  String autor, int ano){
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;

    }

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void bibliotecaInfo(){
        System.out.println("Título do livro :"+ getTitulo()); 
        System.out.println("Autor : " + getAutor());
        System.out.println("Ano de publicação" + getAno());  
    }

}
