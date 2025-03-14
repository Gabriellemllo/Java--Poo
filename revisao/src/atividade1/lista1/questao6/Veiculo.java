package lista1.questao6;

// Registro de Veículos: Um departamento de trânsito precisa de um sistema para registrar veículos. 
// Desenvolva classe Veiculo com atributos para a placa, marca e ano. Registre três veículos diferentes e apresente seus dados.

public class Veiculo {
    private String placa;   
    private String marca;
    private int ano;

    public Veiculo(String placa, String marca, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirVeiculo() {
        System.out.println("Placa do Veículo é: " + getPlaca());
        System.out.println("Marca do Veículo: " + getMarca());
        System.out.println("Ano do Veículo: " + getAno());
    }
}
