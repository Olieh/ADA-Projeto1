package modulo2.parte4heranca;

public class Gato extends Animal{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
