
package exe03;


// Classe abstrata ContaBancaria
abstract class ContaBancaria {
    protected double saldo;

    // Método abstrato para sacar dinheiro
    public abstract void sacar(double valor);

    // Método abstrato para depositar dinheiro
    public abstract void depositar(double valor);

    // Método para obter o saldo atual
    public double getSaldo() {
        return saldo;
    }
}

// Classe concreta ContaCorrente
class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + valor);
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }
}

// Classe concreta ContaPoupanca
class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_JUROS = 0.02; // 2% de juros

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + valor);
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    // Método para aplicar juros
    public void aplicarJuros() {
        saldo += saldo * TAXA_JUROS;
        System.out.println("Juros aplicados. Saldo atual: R$" + saldo);
    }
}

// Classe principal
public class Exe03 {
    public static void main(String[] args) {
        // Cria instâncias de diferentes tipos de contas
        ContaBancaria contaCorrente = new ContaCorrente(1000.00, 500.00);
        ContaBancaria contaPoupanca = new ContaPoupanca(1500.00);

        // Realiza operações na ContaCorrente
        contaCorrente.depositar(200.00);
        contaCorrente.sacar(600.00);
        contaCorrente.sacar(700.00);

        // Realiza operações na ContaPoupanca
        contaPoupanca.depositar(300.00);
        contaPoupanca.sacar(100.00);
        ((ContaPoupanca) contaPoupanca).aplicarJuros();
    }
}
