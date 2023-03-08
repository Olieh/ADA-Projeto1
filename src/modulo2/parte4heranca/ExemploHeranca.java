package modulo2.parte4heranca;

public class ExemploHeranca {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 10);
        animal.emitirSom(); // Animal emitindo som

        Cachorro cachorro = new Cachorro("Rex", 5);
        cachorro.emitirSom(); // Au au
    }
}