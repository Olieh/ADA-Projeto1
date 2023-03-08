package modulo2.parte2;

import java.util.Scanner;

public class TesteCalculadora {
    static Scanner leitor;
    public static void main(String[] args) {
        leitor = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        do {
            int opcao;
            do {
                System.out.println("INICIANDO CALCULO ===========================");
                System.out.println("Escolha uma upção:");
                System.out.println("[1] - Adição");
                System.out.println("[2] - Subtração");
                System.out.println("[3] - Multiplicação");
                System.out.println("[4] - Divisão");
                opcao = Integer.parseInt(leitor.nextLine());
            } while ((opcao < 1) || (opcao > 4));
            calculadora.entradaDeDados();
            switch (opcao) {
                case 1:
                    calculadora.somar();
                    break;
                case 2:
                    calculadora.substrair();
                    break;
                case 3:
                    calculadora.multiplicar();
                    break;
                case 4:
                    calculadora.dividir();
                    break;
                default:
                    System.out.println("Engraçado chegar nessa linha, achei que tinha evitado o problema com o laço anterior");
            }
            System.out.println("O resultado é: " + calculadora.saídaDeDados());
            calculadora.saídaDeDados();
        } while (continuar());
    }
    private static boolean continuar() {
        while (true) {
            System.out.println("====================================");
            System.out.println("Deseja continuar? s/n");
            String resposta = leitor.nextLine();
            if (resposta.equals("s")) {
                return true;
            } else if (resposta.equals("n")) {
                return false;
            } else {
                System.out.print("Não existe essa opção, por favor responda novamente: ");
            }
        }
    }
}
