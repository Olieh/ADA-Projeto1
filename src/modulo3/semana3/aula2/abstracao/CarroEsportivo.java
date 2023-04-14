package modulo3.semana3.aula2.abstracao;

import modulo3.semana3.aula4.abstracao.VeiculoInterface;

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
