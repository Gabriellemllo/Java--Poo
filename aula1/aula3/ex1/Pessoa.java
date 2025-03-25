package aula1.aula3.ex1;

public class Pessoa{
    private String nome;
    private String data;

    public Pessoa(String nome,String data){
        this.nome = nome;
        this.data = data;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getData(){
        return this.data;
    }

    public void setData(String data){
        this.data = data;
    }
}