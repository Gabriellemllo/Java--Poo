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


public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Ford", "Fiesta", 2020);
        Carro carro = new Carro("toyta","Corolla",2023,4);
        Motocicleta moto = new Motocicleta("Honda", "CB500", 2022, "Alto");


        // Exibindo informações do veículo base
        System.out.println("Informações do Veículo:");
        veiculo.informacoes();
        System.out.println();
        // Exibindo informações do carro
        System.out.println("Informações do Carro:");
        carro.informacoes();
        System.out.println();
        // Exibindo informações da motocicleta
        System.out.println("Informações da Motocicleta:");
        moto.informacoes();

    }
}
