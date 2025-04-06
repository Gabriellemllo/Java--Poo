package aula1.RevisaoProva01.questao01;

// Crie a classe base Animal com o método som(), que imprime uma
// mensagem dizendo que o animal emite um som genérico.
// Crie duas subclasses: Cachorro e Gato. Cada uma deve sobrescrever o
// método som() para emitir o som específico do animal (por exemplo, "O
// cachorro faz: Au Au").
// Implemente uma classe Zoologico que instancie um cachorro e um gato, e
// faça cada um emitir seu som chamando o método som().
// Crie uma Main para testar e manipular todos os objetos citados
// anteriormente.

public class Animal {
    //private String nome;
    //private int idade;
    //private String tipo;

    //public Animal() {
    //}

   // public Animal(String nome,int idade,String tipo){
        //this.nome = nome;
        //this.idade = idade;
        //this.tipo = tipo;
    //}

    //public String getNome(){
        //return nome;
    //}

    //public void setNome(String nome){
        //this.nome = nome;
    //}

    //public int getIdade(){
        //return idade;
    //}

    //public void setIdade(int idade){
        //this.idade = idade;
    //}

    //public String getTipo() {
        //return tipo;
    //}

    //public void setTipo(String tipo){
        //this.tipo = tipo;
    //}

    
    public void emitirSom(){
        System.out.println("'o animal está fazendo um som genérico!");
        
    }
}
