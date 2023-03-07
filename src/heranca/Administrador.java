package heranca;

// O administrativo deve calcular o seu salário, com
// base em horas trabalhadas, horas extras e o valor da hora trabalhada.

public class Administrador extends Funcionario{
    private double valorHora;
    private double salario;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n valorHora=" + valorHora +
                "\n salario=" + salario +
                super.toString();
    }
}
