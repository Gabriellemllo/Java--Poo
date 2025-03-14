public class Pessoa {
    private String nome;
    private short idade;

    public Pessoa (String nome , short idade) {
        this.nome = nome;
        this.idade= idade;
    }

    public Pessoa() {
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }
}
