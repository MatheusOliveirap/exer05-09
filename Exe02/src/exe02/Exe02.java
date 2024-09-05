
package exe02;


import java.util.ArrayList;
import java.util.List;

// Classe abstrata Animal
abstract class Animal {
    // Método abstrato para emitir som
    public abstract void emitirSom();
    
    // Método abstrato para mover
    public abstract void mover();
}

// Classe concreta Cachorro
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au Au");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo.");
    }
}

// Classe concreta Gato
class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miau");
    }

    @Override
    public void mover() {
        System.out.println("O gato está pulando.");
    }
}

// Classe concreta Passaro
class Passaro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O pássaro faz: Pi Pi");
    }

    @Override
    public void mover() {
        System.out.println("O pássaro está voando.");
    }
}

// Classe principal
public class Exe02 {
    public static void main(String[] args) {
        // Cria uma lista de animais
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Passaro());

        // Itera sobre a lista e chama os métodos emitirSom() e mover()
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println();
        }
    }
}

