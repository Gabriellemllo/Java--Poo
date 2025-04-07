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

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularFolhaDePagamento() {
        double totalGerentes = 0;
        double totalDesenvolvedores = 0;
        double totalEstagiarios = 0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario();
            if (funcionario instanceof Gerente) {
                totalGerentes += salario;
            } else if (funcionario instanceof Desenvolvedor) {
                totalDesenvolvedores += salario;
            } else if (funcionario instanceof Estagiario) {
                totalEstagiarios += salario;
            }
        }

        System.out.println("Total de salários dos Gerentes: " + totalGerentes);
        System.out.println("Total de salários dos Desenvolvedores: " + totalDesenvolvedores);
        System.out.println("Total de salários dos Estagiários: " + totalEstagiarios);
    }
}
