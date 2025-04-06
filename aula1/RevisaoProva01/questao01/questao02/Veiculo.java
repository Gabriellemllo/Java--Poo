package aula1.RevisaoProva01.questao01.questao02;

// Criar a classe base Veiculo com os atributos marca, modelo e ano, e um
// método informacoes() que imprime essas informações.
// Criar as subclasses Carro e Motocicleta. Adicione um atributo exclusivo
// Carro, como numeroDePortas, e outro exclusivo à Motocicleta, como
// tipoDeGuidão.
// Em ambas as subclasses, sobrescrever o método informacoes() para exibir
// as informações comuns e específicas de cada veículo.
// Crie uma Main para testar e manipular todos os objetos citados
// anteriormente.

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(){

    }


    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void informacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
