package modulo2.parte7;

import java.math.BigDecimal;
import java.util.Arrays;

public class Gerente extends  Empregado{
    private int contEmpregados;
    private Empregado[] subordinados;

    public Gerente() {
    }

//    public Gerente(String nome, int matricula, BigDecimal salario, int contEmpregados) {
//        super(nome, matricula, salario);
//        this.contEmpregados = new ;
//        this.subordinados = subordinados;
//    }

    public Gerente(String nome, int matricula, BigDecimal salario, int contEmpregados, Empregado[] subordinados) {
        super(nome, matricula, salario);
        this.contEmpregados = contEmpregados;
        this.subordinados = subordinados;
    }

    public int getContEmpregados() {
        return contEmpregados;
    }

    public void setContEmpregados(int contEmpregados) {
        this.contEmpregados = contEmpregados;
    }

    public Empregado[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Empregado[] subordinados) {
        this.subordinados = subordinados;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "contEmpregados=" + contEmpregados +
                ", subordinados=" + Arrays.toString(subordinados) +
                '}';
    }
}
