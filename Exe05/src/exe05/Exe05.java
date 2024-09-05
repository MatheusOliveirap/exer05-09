
package exe05;


abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato para calcular o salário do funcionário
    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        // Salário do gerente com bônus
        return salarioBase + bonus;
    }
}

class Programador extends Funcionario {
    private double horasExtras;
    private double valorHoraExtra;

    public Programador(String nome, double salarioBase, double horasExtras, double valorHoraExtra) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        // Salário do programador com horas extras
        return salarioBase + (horasExtras * valorHoraExtra);
    }
}

public class Exe05 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente("Alice", 5000.0, 1000.0); // Salário base + bônus
        Funcionario funcionario2 = new Programador("Bob", 4000.0, 10, 50.0); // Salário base + horas extras

        // Utilizando polimorfismo para calcular o salário de diferentes funcionários
        System.out.println("Salário do Gerente " + funcionario1.getNome() + ": " + funcionario1.calcularSalario());
        System.out.println("Salário do Programador " + funcionario2.getNome() + ": " + funcionario2.calcularSalario());
    }
}
