package aula1.RevisaoProva01.questao01.questao03;

// Crie a classe base Funcionario com os atributos nome, salarioBase e o
// método calcularSalario(), que retorna o salário base.
// Crie as subclasses Gerente, Desenvolvedor e Estagiario. Cada um terá uma
// regra própria para calcular o salário:
// o Gerente: O salário é o salarioBase mais um bônus fixo.
// o Desenvolvedor: O salário é o salarioBase multiplicado por um fator
// de produtividade.
// o Estagiario: O salário é o salarioBase, sem adicionais.
// Implemente a classe Empresa que gerencie uma lista de funcionários e
// tenha um método calcularFolhaDePagamento() para somar e exibir o
// salário de cada tipo de funcionário.
// Crie uma Main para testar e manipular todos os objetos citados
// anteriormente.

public class Funcionario {
    private String nome;
    private double salarioBase;


    public Funcionario() {
        // Construtor padrão
    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    // Método para calcular o salário base

    public double calcularSalario() {
        return salarioBase;
    }
}