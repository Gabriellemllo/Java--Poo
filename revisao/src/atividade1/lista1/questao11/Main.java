package atividade1.lista1.questao11;

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
        ContaCorrente conta1 = new ContaCorrente("1234", 1000, "Bernardo");
        ContaCorrente conta2 = new ContaCorrente("5678", 2000, "Maria");


        try {
            conta1.depositar(100);
            conta1.sacar(200);
            conta1.transferir(conta2, 300);
        } catch (Exception e) {
            System.out.println("");
        }
        
        conta1.depositar(500);
        conta1.sacar(200);
        conta1.transferir(conta2, 300);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
