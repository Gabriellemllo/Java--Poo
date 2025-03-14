package lista1.questao4;

import lista1.questao4.Funcionario;

//Gerenciamento de Funcionários: Uma empresa deseja manter um registro de seus funcionários. 
//Crie uma classe Funcionario com atributos para nome
//departamento e salário. Registre três funcionários e mostre os detalhes de cada um.

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("Kako", "técnico" , 1.400);
        Funcionario funcionario2 = new Funcionario("Carlos", "Jornalismo", 3.500);
        Funcionario funcionario3 = new Funcionario("Elcio", "Marketing", 3.500);

        
        funcionario1.exibirFuncionario();
        System.out.println();

        funcionario2.exibirFuncionario();
        System.out.println();
        
        funcionario3.exibirFuncionario();
    }
}
