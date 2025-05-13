package aula1.aula6;

public class Musico extends Artista {
    private int qtdeMusicas;
    private String instrumento;

    public Musico(String nome, int idade, int qtdeMusicas, String instrumento) {
        super(nome, idade);
        this.qtdeMusicas = qtdeMusicas;
        this.instrumento = instrumento;
    }

    public int getQtdeMusicas() {
        return qtdeMusicas;
    }

    public void setQtdeMusicas(int qtdeMusicas) {
        this.qtdeMusicas = qtdeMusicas;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public void realizarApresentacao() {
        System.out.println("O músico " + getNome() + " está tocando uma música ");
    }
    

}
