package modulo3.semana3.aula4.abstracao;

public class CarroPasseio implements VeiculoInterface {

    private int velocidade;

    @Override
    public void acelerar() {
        this.velocidade += 10;
    }

    @Override
    public String toString() {
        return "CarroPasseio{" +
                "velocidade=" + velocidade +
                '}';
    }
}
