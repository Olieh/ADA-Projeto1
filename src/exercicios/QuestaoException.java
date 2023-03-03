package exercicios;

import java.util.Scanner;

public class QuestaoException {
    static int resultado;
    static int n1;
    static int n2;

    public static void main(String[] args) {
        resultado = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("DIVISÃO ENTRE DOIS NUMEROS");
        try {
            System.out.print("Informe o valor do 1º numero: ");
            n1 = Integer.parseInt(leitor.nextLine());
            System.out.print("Informe o valor do 2º numero: ");
            n2 = Integer.parseInt(leitor.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ERRO AO TENTAR INSERIR UM CARACTERE NÃO NUMÉRICO ");
        }
        try {
            System.out.println("O RESULTADO É: " + (n1 / n2));
        } catch (ArithmeticException e) {
            System.out.println("ERRO AO TENTAR FAZER DIVISÃO DE UM VALOR POR 0 (ZERO)");
        }
    }
}
