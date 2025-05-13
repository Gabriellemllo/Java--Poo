//Uma empresa deseja modelar seus diferentes tipos de trabalhadores para realizar uma análise interna sobre salários e funções desempenhadas. 
//Cada tipo de trabalhador possui uma lógica distinta para o cálculo do salário final e para a descrição de suas atividades. 
//O sistema precisa representar essas variações e aplicar regras de bonificação e adicionais conforme o tipo de contrato.
//Crie uma hierarquia de classes que represente trabalhadores de uma empresa.
//A classe abstrata Trabalhador possui os atributos:
//nome (não pode ser nulo ou vazio),
//salarioBase (deve ser maior que zero).
//Os métodos abstratos:
//calcularSalarioMensal(): retorna o salário final do trabalhador.
//descricaoTrabalho(): retorna uma string com a descrição do trabalho.
//Crie duas subclasses:
//TrabalhadorCLT: recebe um bônus fixo de R$ 500 se o salário base for maior que R$ 3000.
//TrabalhadorAutonomo: recebe 80% do salário base como valor final, mas se for menor que R$ 1500, recebe um adicional de R$ 200.

//public abstract class Trabalhador {
    
//}
