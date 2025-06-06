package lista1;

import java.util.ArrayList;
import java.util.Scanner;

//Gestão de Biblioteca: Imagine que você precisa organizar as informações dos livros em uma biblioteca.
// Crie uma classe Livro com atributos para armazenar o título.
// autor e ano de publicação. Em seguida, simule a adição de três livros ao sistema, mostrando suas informações.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        System.out.println("Cadastro de Livros");
        System.out.println("------------------------");


        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "º livro:");
            System.out.print("Digite o título do livro: ");
            String titulo = sc.nextLine();
            System.out.print("Digite o autor do livro: ");
            String autor = sc.nextLine();
            System.out.print("Digite o ano de publicação do livro: ");
            int ano = sc.nextInt();
            sc.nextLine(); 

            Livro livro = new Livro(titulo, autor, ano);
            livros.add(livro);
            System.out.println();
        }

        try{
            livros.get(0).setTitulo("");
        }catch(Exception e){
            System.out.println("O título não pode ser nulo");
        }

        System.out.println("Livros cadastrados:");
        System.out.println();

        for (Livro livro : livros) {
            livro.LivroInfo();
            System.out.println();
        }

        sc.close();
    }
}
