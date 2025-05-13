package aula1.aula6;

public class Responsavel {
    private String nome;
    private String cargo;
    private Artista artista;
    

    public Responsavel(String nome, String cargo, Artista artista) {
        this.nome = nome;
        this.cargo = cargo;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    // coloca o nome da agregação para pegar qualquer artista
    // e não só o músico
    // o artista pode ser um músico ou um dançarino
    public void acompanharArtista(Artista artista) {
        System.out.println("O responsável está acompanhando o artista " + artista.getNome() + " durante a apresentação.");
    }
}
