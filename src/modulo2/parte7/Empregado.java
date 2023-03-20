package modulo2.parte7;

import java.math.BigDecimal;

public class Empregado implements Comparable{
    private String nome;
    private int  matricula;
    private BigDecimal salario;

    public Empregado() {
    }

    public Empregado(String nome, int matricula, BigDecimal salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Object other) {
        Empregado empregado = (Empregado) other;
        if (this.matricula < empregado.matricula){
            return -1;
        }if (this.matricula > empregado.matricula){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}
