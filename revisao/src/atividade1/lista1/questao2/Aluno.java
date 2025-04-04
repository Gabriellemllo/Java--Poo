package lista1.questao2;

// Sistema de Controle de Alunos: Uma escola precisa de um sistema para gerenciar informações sobre seus alunos.
//  Desenvolva uma classe Aluno com atributos para o nome, idade e série. 
// Crie objetos para representar três alunos diferentes e mostre seus dados.

public class Aluno{
    private String nome;
    private int idade;
    private int serie;

    public Aluno(String nome, int idade, int serie){
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    
    }
    
    public String getNome(){
    return nome;
    }

    public void setNome(String nome){
    this.nome = nome;
    }

    public int getIdade(){
    return idade;
    }

    public void setIdade(int idade)throws Exception{
        if(idade < 0){
            throw new Exception("A idade não pode ser negativa");
        }
    this.idade = idade;
    }

    public int getSerie(){
    return serie;
    }

    public void setSerie(int serie){
    this.serie = serie;
    }   

    public void exibirAluno(){
        System.out.println("Nome do aluno: "+ getNome()); 
        System.out.println("Idade do aluno : " + getIdade());
        System.out.println("Série do aluno : " + getSerie());  
    }
}