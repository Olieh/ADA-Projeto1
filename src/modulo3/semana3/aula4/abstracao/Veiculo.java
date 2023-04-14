package modulo3.semana3.aula4.abstracao;

public abstract class Veiculo {

    protected int velocidade;

    public abstract void acelerar();

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                '}';
    }
}
