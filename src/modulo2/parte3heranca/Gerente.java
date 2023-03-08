package modulo2.parte3heranca;

// O gerente deve, além de cadastrar os seus dados, calcular
// quantas horas a mais ele trabalhou na semana, considerando
// um valor de horas como entrada e a semana como 44 horas.

public class Gerente extends Funcionario{
    private final int HORASEMANA = 44;
    private int horasMais;

    public int getHorasMais() {
        return horasMais;
    }

    public void setHorasMais(int horasMais) {
        this.horasMais = horasMais;
    }

    public int getHORASEMANA() {
        return HORASEMANA;
    }

    @Override
    public String toString() {
        return  "\n horasMais=" + horasMais +
                "\n HORASEMANA=" + HORASEMANA +
                super.toString();
    }
}
