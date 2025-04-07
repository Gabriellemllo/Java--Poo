package aula1.RevisaoProva01.questao01.questao03;

// Crie a classe base Funcionario com os atributos nome, salarioBase e o
// método calcularSalario(), que retorna o salário base.
// Crie as subclasses Gerente, Desenvolvedor e Estagiario. Cada um terá uma
// regra própria para calcular o salário:
// o Gerente: O salário é o salarioBase mais um bônus fixo.
// o Desenvolvedor: O salário é o salarioBase multiplicado por um fator
// de produtividade.
// o Estagiar3io: O salário é o salarioBase, sem adicionais.
// Implemente a classe Empresa que gerencie uma lista de funcionários e
// tenha um método calcularFolhaDePagamento() para somar e exibir o
// salário de cada tipo de funcionário.
// Crie uma Main para testar e manipular todos os objetos citados
// anteriormente.

public class Desenvolvedor extends Funcionario {

    private double fatorProdutividade;

    public Desenvolvedor(String nome, double salarioBase, double fatorProdutividade) {
        super(nome, salarioBase);
        this.fatorProdutividade = fatorProdutividade;
    }


    public double getFatorProdutividade() {
        return fatorProdutividade;
    }

    public void setFatorProdutividade(double fatorProdutividade) {
        this.fatorProdutividade = fatorProdutividade;
    }

    @Override
    public double calcularSalario() {
        // O salário do desenvolvedor é o salário base multiplicado pelo fator de produtividade
        return getSalarioBase() * fatorProdutividade;
    }

    
}
