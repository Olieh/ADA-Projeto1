package Modulo2.parte1;

public class Funcionario {
    public int matricula;
    public String nome;
    public String cargo;
    public double salario_hora;
    public double quantidade_hora;

    public void mostrarDados(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario hora: "+salario_hora);
        System.out.println("Quantidade hora: "+quantidade_hora);
        System.out.println("Salario final: "+calcularSalario());
    }

    public double calcularSalario(){
        return (quantidade_hora * salario_hora);
    }

}
