package aula1.aula3.ex1.ex2;

public class Veiculo {
    private String placa;
    private String motor;
    private String modelo;
    private double capTanque;
    private int ano;

    public Veiculo(String placa, String motor, String modelo, double capTanque, int ano) {
        this.placa = placa;
        this.motor = motor;
        this.modelo = modelo;
        this.capTanque = capTanque;
        this.ano = ano;
    }
// construtor vazio
    public Veiculo() {
    }

    //Getters
    public String getPlaca() {
        return placa;
    }

    public String getMotor() {
        return motor;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapTanque() {
        return capTanque;
    }

    public int getAno() {
        return ano;
    }

    //Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapTanque(double capTanque) {
        this.capTanque = capTanque;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // método para calcular o consumo
   public double calcularConsumo(double km){
    return 0;
   }
}
