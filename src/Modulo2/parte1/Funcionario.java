package Modulo2.parte1;

public class Funcionario {
    public int matricula;
    public String nome;
    public String cargo;
    public double salarioHora;
    public double quantidadeHora;

    public void mostrarDados(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario hora: "+ salarioHora);
        System.out.println("Quantidade hora: "+ quantidadeHora);
        System.out.println("Salario final: "+calcularSalario());
    }

    public double calcularSalario(){
        return (quantidadeHora * salarioHora);
    }

}
