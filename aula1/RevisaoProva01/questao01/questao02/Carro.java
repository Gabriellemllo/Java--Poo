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

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro() {
       
    }

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca,modelo,ano); // Chama o construtor da classe base Veiculo
        this.numeroDePortas = numeroDePortas;
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void informacoes() {
        super.informacoes(); // Chama o método informacoes da classe base Veiculo// É Adequado usar !!
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}
