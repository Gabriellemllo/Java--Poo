package lista1.questao10;

// Sistema de Pedidos de Restaurante: Um restaurante deseja um sistema para gerenciar pedidos. 
// Implemente uma classe Pedido que contenha o número do pedido, a descrição dos itens pedidos e o valor total. 
// Crie três pedidos diferentes e apresente os detalhes.

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("01", "Sushi, coca-cola zero", 50.00);
        Pedido pedido2 = new Pedido("02", "Hambúrguer, Batata Frita", 20.00);
        Pedido pedido3 = new Pedido("03", "Lasanha, Suco de Abacaxi", 28.00);

        try {
            pedido1.setDescricaoItens(null);

        } catch (Exception e){
            System.out.println("Sua descrição não pode ser vazia");
        }

        try {
            pedido2.setDescricaoItens(" ");
        } catch (Exception e){
            System.out.println("Sua descrição não pode ser vazia");
        }
        
        try {
            pedido3.setDescricaoItens("");
        } catch (Exception e){
            System.out.println("Sua descrição não pode ser vazia");
        }
        

        pedido1.exibirPedido();
        pedido2.exibirPedido();
        pedido3.exibirPedido();
    }
}
