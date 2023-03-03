package Modulo2.parte1;

public class Exercicioi1TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 =  new Funcionario();
        funcionario1.matricula = 10992;
        funcionario1.nome = "João";
        funcionario1.cargo = "PROGRAMADOR";
        funcionario1.salario_hora = 15 ;
        funcionario1.quantidade_hora = 160;
        funcionario1.mostrarDados();
    }
}
