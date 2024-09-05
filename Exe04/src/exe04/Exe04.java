
package exe04;


abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    // Método abstrato para calcular o valor do pagamento
    public abstract double calcularValor();

    public double getValor() {
        return valor;
    }
}

class PagamentoCartaoCredito extends Pagamento {
    private double taxaJuros;

    public PagamentoCartaoCredito(double valor, double taxaJuros) {
        super(valor);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double calcularValor() {
        // Calcula o valor final com taxa de juros
        return valor + (valor * taxaJuros / 100);
    }
}

class PagamentoBoleto extends Pagamento {
    private double taxaBoleto;

    public PagamentoBoleto(double valor, double taxaBoleto) {
        super(valor);
        this.taxaBoleto = taxaBoleto;
    }

    @Override
    public double calcularValor() {
        // Calcula o valor final com taxa de boleto
        return valor + taxaBoleto;
    }
}

public class Exe04 {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartaoCredito(100.0, 5.0); // 100 + 5% de juros
        Pagamento pagamento2 = new PagamentoBoleto(100.0, 2.0); // 100 + taxa de boleto

        // Utilizando polimorfismo para calcular o valor de diferentes métodos de pagamento
        System.out.println("Valor final do Pagamento com Cartão de Crédito: " + pagamento1.calcularValor());
        System.out.println("Valor final do Pagamento com Boleto: " + pagamento2.calcularValor());
    }
}
