package lista1.questao4;

// Gerenciamento de Funcionários: Uma empresa deseja manter um registro de seus funcionários. 
// Crie uma classe Funcionario com atributos para nome, departamento e salário. 
// Registre três funcionários e mostre os detalhes de cada um.

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;


    public Funcionario(String nome, String departamento, Double salario){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }
    
    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void exibirFuncionario(){
        System.out.println("Nome do Funcionário: " + getNome());
        System.out.println("Departamento do Funcionário: " + getDepartamento());
        System.out.println("Salário do Funcionário: " + getSalario());
    }
}

