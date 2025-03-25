package aula1.aula3.ex1.ex2;

public class Moto extends Veiculo{
    private double capBagajeiro;

    public Moto(String placa,String motor, String modelo , double capTanque,int ano, double capBagajeiro){
        super(placa, motor,modelo,capTanque,ano);
        this.capBagajeiro = capBagajeiro;
    }

    public double getCapBagajeiro() {
        return capBagajeiro;
    }

    public void setCapBagajeiro(double capBagajeiro) {
        this.capBagajeiro = capBagajeiro;
    }

    public double calcularConsumo(double km){
        return km/30.0;
    }
} 
    
