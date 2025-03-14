package lista1.questao8;

public class Evento {
    
    private String nomeEvento;
    private String data;
    private String local;

    public Evento(String nomeEvento, String data, String local) {
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.local = local;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void exibirEvento() {
        System.out.println("Nome do Evento: " + getNomeEvento());
        System.out.println("Data: " + getData());
        System.out.println("Local: " + getLocal());
    }
}
