package ex2;

public class Main {
    public static void main(String []args){
        Pessoa pessoa1 = new Pessoa("João", (short) 19);
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Pietro");
        System.out.println(pessoa2.getNome());
        short idade = 18;
        try {
            pessoa2.setIdade(idade);
        } catch (Exception e) {
            System.out.println("Idade não permitida");
        }
        System.out.println(pessoa2.getIdade());
        }
    
}
