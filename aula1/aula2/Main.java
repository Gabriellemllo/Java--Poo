public class Main {
    public static void main(String []args){
        Pessoa pessoa1 = new Pessoa("João", (short) 19);
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Pietro");
        System.out.println(pessoa2.getNome());
    }
}
