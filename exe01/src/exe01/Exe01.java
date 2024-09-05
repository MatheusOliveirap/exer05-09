
package exe01;


// Classe abstrata FormaGeometrica
abstract class FormaGeometrica {
    // Método abstrato para calcular a área
    public abstract double calcularArea();
}

// Classe concreta Circulo
class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Classe concreta Retangulo
class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

// Classe concreta Triangulo
class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}

// Classe principal
public class Exe01 {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas[0] = new Circulo(5.0);
        formas[1] = new Retangulo(4.0, 6.0);
        formas[2] = new Triangulo(3.0, 7.0);

        for (FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}

