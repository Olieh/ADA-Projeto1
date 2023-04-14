package br.com.ada.first973.aulas.revisaoPOO.abstracao;

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
