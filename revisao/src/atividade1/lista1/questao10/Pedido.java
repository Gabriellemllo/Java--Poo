package lista1.questao10;

// Sistema de Pedidos de Restaurante: Um restaurante deseja um sistema para gerenciar pedidos. 
// Implemente uma classe Pedido que contenha o número do pedido, a descrição dos itens pedidos e o valor total. 
// Crie três pedidos diferentes e apresente os detalhes.

public class Pedido {
    public String numeroPedido;
    public String descricaoItens;
    public double valorTotal;

    public Pedido() {
    }
    
    public Pedido(String numeroPedido, String descricaoItens, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.descricaoItens = descricaoItens;
        this.valorTotal = valorTotal;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescricaoItens() {
        return descricaoItens;
    }

    public void setDescricaoItens(String descricaoItens) throws Exception {
        if (descricaoItens == null  || descricaoItens.trim().isEmpty()) {
            throw new Exception();
        }
        this.descricaoItens = descricaoItens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void exibirPedido() {
        System.out.println("Número do Pedido: " + getNumeroPedido());
        System.out.println("Descrição dos Itens: " + getDescricaoItens());
        System.out.println("Valor Total: " + getValorTotal());
    }
}
