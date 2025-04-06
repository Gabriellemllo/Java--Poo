package aula1.RevisaoProva01.questao01;

public class Gato extends Animal {
    // private String nome;
    // private int idade;
    // private String raca;

    // public Gato() {
    // }

    // public Gato(String nome, int idade, String raca) {
    //     this.nome = nome;
    //     this.idade = idade;
    //     this.raca = raca;
    // }

    // public String getNome() {
    //     return nome;
    // }

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    // public int getIdade() {
    //     return idade;
    // }

    // public void setIdade(int idade) {
    //     this.idade = idade;
    // }

    // public String getRaca() {
    //     return raca;
    // }

    // public void setRaca(String raca) {
    //     this.raca = raca;
    // }

   @Override
    // Sobrescrevendo o método emitirSom da classe Animal
    public void emitirSom() {
        System.out.println("O gato faz: Miau Miau");
    }
    
}
