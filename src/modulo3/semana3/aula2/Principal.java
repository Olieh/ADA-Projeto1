package modulo3.semana3.aula2;

import java.util.Scanner;

public class Principal {
    //    Criar um programa que pergunte para o usuario em qual formato ele queer imprimir uma mensagem.
    //    Entrada: mensagem, formato
    //    Saida: mensagem no formato escolhido
    //  Formatos aceitos:
    //  Tudo em maiusculo
    //      string.toUpperCase();
    //  Tudo em minusculo
    //      string.toLowerCase();
    //  Com a data e hora atual na frente da mensagem
    //      LocalDateTime.now() + string

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        MensagemInterface mensagem = null;
        while (true) {
            System.out.println("######################################################");
            System.out.println("Informe umas das opçoes");
            System.out.println(" 1 = Tudo em maiusculo");
            System.out.println(" 2 = Tudo em minusculo");
            System.out.println(" 3 = Com a data e hora atual na frente da mensagem");
            System.out.println(" 0 = Sair");
            System.out.println("######################################################");
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    mensagem = new mensagemMaiusculo();
                    break;
                case 2:
                    mensagem = new mensagemMinusculo();
                    break;
                case 3:
                    mensagem = new mensagemComData();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Esse numero não é de uma opção");
                    break;
            }
            System.out.println("Informe um texto:");
            String texto = scanner.nextLine();
            System.out.println(mensagem.aplicarMensagem(texto));
        }
    }
}
