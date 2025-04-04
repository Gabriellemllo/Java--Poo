package lista1.questao11;

//Classe ContaCorrente Um banco digital deseja oferecer aos seus clientes uma experiência simplificada através de uma conta corrente 
//que permita depósitos, saques, transferências e consulta de saldo. Para atender a essa necessidade, 
//você deve criar a classe ContaCorrente com os atributos numeroDaConta (String), saldo (double) e nomeDoTitular (String).
//Métodos:
//depositar(double valor): aumenta o saldo.
//sacar(double valor): diminui o saldo, se houver saldo suficiente.
//transferir(ContaCorrente destino, double valor): transfere valor de uma conta para outra.
//exibirSaldo(): mostra o saldo atual da conta.


public class ContaCorrente {
    private String numeroDaConta;
    private double saldo;
    private String nomeDoTitular;

    public ContaCorrente(String numeroDaConta, double saldo, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo)throws Exception {
        if (saldo < 0) {
            throw new Exception("Saldo não pode ser negativo");
            
        }
        this.saldo = saldo;
    }

    public String getNomeDoTitular(){
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }


    
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor)throws Exception {
        if (saldo < valor) {
            throw new Exception("Saldo insuficiente");
        }
        
        if (saldo >= valor) {
            saldo -= valor;
        }
    }

    public void transferir(ContaCorrente destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
        }
    }

   
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

}
