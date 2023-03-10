package modulo2.parte3heranca;

// O administrativo deve calcular o seu salário, com
// base em horas trabalhadas, horas extras e o valor da hora trabalhada.

public class Administrador extends Funcionario{
    private double valorHora;
    private int horaExtra;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public double calcularSalrio(){
        double salario = (getHorasDiariaTrabalhada() * getValorHora()) + (getValorHora() * getHoraExtra());
        return salario;
    }

    @Override
    public String toString() {
        return "\n valorHora=" + valorHora +
                "\n salario=" + calcularSalrio() +
                super.toString();
    }
}
