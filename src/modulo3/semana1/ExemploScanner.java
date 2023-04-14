package modulo3.semana1;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe sua idade: ");
        int idade  = scanner.nextInt();
        System.out.println("imprimindo idade: "+idade);
    }
}
