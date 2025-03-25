package aula1.aula3.ex1;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;

    // Colocar a Sobrecarga 
    // e o que tava errado era a posição das chaves !!!!
    

    public PessoaFisica(String nome, String data, String cpf, String rg){
        super(nome, data);
        this.cpf = cpf;
        this.rg = rg; 

        // segunda opção:
        // this.cpf = cpf;
        // this.rg = rg;
        //setNome(nome);
        //setData(data)
    }

    public String getCpf(){
        return cpf;
    }  
   

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public void andar(){
        System.out.println("A pessoa fisica está andando");
    }
    
}