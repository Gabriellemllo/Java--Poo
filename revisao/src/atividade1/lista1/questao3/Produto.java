package lista1.questao3;

//Catálogo de Produtos: Uma loja virtual quer manter um catálogo de seus produtos. 
//Implemente uma classe Produto com atributos para nome,
//preço e categoria. Adicione três produtos ao catálogo e exiba as informações de cada um.

public class Produto {
    public String nome;
    public double preco;
    public String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco)throws Exception {
        if(preco < 0){
            throw new Exception("O preço não pode ser negativo");
        }
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Produto: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Categoria: " + getCategoria());
    }
    
}
