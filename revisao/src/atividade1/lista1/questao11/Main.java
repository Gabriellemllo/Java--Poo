package lista1.questao11;

//Classe ContaCorrente Um banco digital deseja oferecer aos seus clientes uma experiência simplificada através de uma conta corrente 
//que permita depósitos, saques, transferências e consulta de saldo. Para atender a essa necessidade, 
//você deve criar a classe ContaCorrente com os atributos numeroDaConta (String), saldo (double) e nomeDoTitular (String).
//Métodos:
//depositar(double valor): aumenta o saldo.
//sacar(double valor): diminui o saldo, se houver saldo suficiente.
//transferir(ContaCorrente destino, double valor): transfere valor de uma conta para outra.
//exibirSaldo(): mostra o saldo atual da conta.


public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("12345", 100.00, "Joanna");
        ContaCorrente conta2 = new ContaCorrente("67891", 50.00, "Mario");

       try {
            conta1.depositar(200.00);
            conta1.sacar(50.00);
            conta1.transferir(conta2, 300.00);
        } catch (Exception e) {
            System.out.println("Saldo Insuficiente!");
        }

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
   
}
