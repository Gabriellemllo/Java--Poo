public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("A residencia vai ser justa");
        char genero = 'f';
        String nome = "Bernardo";
        int idade = 32;
        double altura = 1.60;
        boolean canVote = false;
        System.out.println("Seu genero :"+ genero);
        System.out.println("Nome:"+ nome);
        System.out.println("Sua idade:"+ idade);
        System.out.println("Sua altura:"+ altura);
        if (idade < 16) {
            System.out.println(nome + "Não pode votar"); 
        }
        else if(idade < 18 || idade > 64  ){
            System.out.println(nome +" pode votar!!(facultativo)");
            canVote = true ;
        }
        else{
            System.out.println(nome + "é obrigatório!");
        }
        if(canVote){
            System.out.println(name + "pvf vote consciente");
        }
    
    }
}
// Revisão com lógica de programação em Java