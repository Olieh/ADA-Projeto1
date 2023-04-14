package modulo3.semana3.aula4.abstracao;

public class Onibus implements VeiculoInterface {

    private int velocidade;

    @Override
    public void acelerar() {
        this.velocidade += 5;
    }

    @Override
    public String toString() {
        return "Onibus{" +
                "velocidade=" + velocidade +
                '}';
    }
}
