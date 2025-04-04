package lista1.questao3;

//Catálogo de Produtos: Uma loja virtual quer manter um catálogo de seus produtos. 
//Implemente uma classe Produto com atributos para nome,
//preço e categoria. Adicione três produtos ao catálogo e exiba as informações de cada um.

public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Bermuda", 30.00 , "Roupas");
        Produto produto2 = new Produto("Blusa", 50.00, "Calçados");
        Produto produto3 = new Produto("Televisão", 4.000, "Eletrônicos");

        
        try {
            produto1.setPreco(-0.50); 
        } catch (Exception e) {
            System.out.println("O preço não pode ser negativo! ");
        }
        
        produto1.exibirInformacoes();
        System.out.println();
        produto2.exibirInformacoes();
        System.out.println();
        produto3.exibirInformacoes();
    }
}
