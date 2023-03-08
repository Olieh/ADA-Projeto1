package modulo2.parte1;

import java.util.Scanner;

public class Funcionario {
    public int matricula;
    public String nome;
    public String cargo;
    public double salarioHora;
    public double quantidadeHora;

    public void entradaDados(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a matricula do funcionario");
        matricula = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe o nome do funcionario");
        nome = leitor.nextLine();
        System.out.println("Informe o cargo do funcionario");
        cargo = leitor.nextLine();
        System.out.println("Informe o salario hora do funcionario");
        salarioHora = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe a quantidade de hora trabalhada do funcionario");
        quantidadeHora = Integer.parseInt(leitor.nextLine());
    }

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
