public class Papagaio extends Animal {
    private String corPenas;
    private boolean podeFalar;
    private String origem;
    private double alturaVooMaxima;

    public Papagaio() {
    }

    public Papagaio(String nome, int idade, String corPenas, boolean podeFalar, String origem, double alturaVooMaxima) {
        super(nome, idade);
        this.corPenas = corPenas;
        this.podeFalar = podeFalar;
        this.origem = origem;
        this.alturaVooMaxima = alturaVooMaxima;
    }

    public String getCor() {
        return corPenas;
    }

    public void setCor(String corPenas) {
        this.corPenas = corPenas;
    }

    public boolean getPodeFalar() {
        return podeFalar;
    }

    public void setPodeFalar(boolean podeFalar) {
        this.podeFalar = podeFalar;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getAlturaVooMaxima() {
        return alturaVooMaxima;
    }

    public void setHabitat(double alturaVooMaxima) {
        this.alturaVooMaxima = alturaVooMaxima;
    }

    @Override
    public void emitirSom() {
        System.out.println("piu-piu piu-piu piu-piu !!");
    }
    
}
