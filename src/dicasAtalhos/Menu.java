package dicasAtalhos;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mensagem de boas-vindas
        System.out.println("Bem-vindo ao programa!");

        // Loop do menu
        while (true) {
            exibirMenu();

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    opcao1();
                    break;
                case 2:
                    opcao2();
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    // Exibe o menu na tela
    private static void exibirMenu() {
        System.out.println("dicasAtalhos.Menu:");
        System.out.println("1. Opção 1");
        System.out.println("2. Opção 2");
        System.out.println("3. Sair");

        System.out.print("Escolha uma opção: ");
    }

    // Lógica para a opção 1
    private static void opcao1() {
        System.out.println("Você escolheu a opção 1");
    }

    // Lógica para a opção 2
    private static void opcao2() {
        System.out.println("Você escolheu a opção 2");
    }
}
