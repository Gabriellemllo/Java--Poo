package aula1.aula3.ex1.ex2;

public class Carro extends Veiculo{
    private int numPortas;
    private String tipoTeto;

    public Carro(String placa,String motor, String modelo, double capTanque,int ano, int numPortas, String tipoTeto){
        super(placa, motor,modelo,capTanque,ano);
        this.numPortas = numPortas;
        this.tipoTeto = tipoTeto;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getTipoTeto() {
        return tipoTeto;
    }

    public void setTipoTeto(String tipoTeto) {
        this.tipoTeto = tipoTeto;
    }

    public double calcularConsumo(double km){
        return km/17.0;
    }
    
}
