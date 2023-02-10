package semana1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("Informe o numero da opção da operação que deseja efetuar");
        int opcao = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe o primeiro numero:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Informe o segundo numero:");
        int numero2 = Integer.parseInt(scanner.nextLine());

        if (opcao == 1){
            System.out.println(numero1+" + "+numero2+" = "+ (numero1 + numero2));
        } else if (opcao == 2) {
            System.out.println(numero1+" - "+numero2+" = "+ (numero1 - numero2));
        } else if (opcao == 3) {
            System.out.println(numero1+" / "+numero2+" = "+ ((double)numero1 / (double)numero2));
        } else if (opcao == 4) {
            System.out.println(numero1+" x "+numero2+" = "+ (numero1 * numero2));
        } else {
            System.out.println("Não temos essa operação");
        }
    }
}
