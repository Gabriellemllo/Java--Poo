package aula1.aula6;

public class Pintor extends Artista {
    private String tipoTinta;
    private int qtdQuadros;

    public Pintor(String nome , int idade ,String estilo, String tipoTinta, int qtdQuadros) {
        super(nome, idade);
        this.tipoTinta = tipoTinta;
        this.qtdQuadros = qtdQuadros;
    }

    public String getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(String tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

    public int getQtdeMusicas() {
        return qtdQuadros;
    }

    public void setQtdeMusicas(int qtdQuadros) {
        this.qtdQuadros = qtdQuadros;
    }

    @Override
    public void realizarApresentacao() {
        System.out.println("O pintor " + getNome() + " está pintando um quadro.");
    }
    
}
