package br.com.ada.first973.aulas.revisaoPOO.abstracao;

public class CarroEsportivo implements VeiculoInterface {

    private int velocidade;

    @Override
    public void acelerar() {
        this.velocidade += 20;
    }

    @Override
    public String toString() {
        return "CarroEsportivo{" +
                "velocidade=" + velocidade +
                '}';
    }
}
