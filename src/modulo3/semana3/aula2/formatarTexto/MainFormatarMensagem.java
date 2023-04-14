package br.com.ada.first973.aulas.revisaoPOO.formatarTexto;

import java.util.Scanner;

public class MainFormatarMensagem {

    public static void main(String[] args) {

        String mensagem = "mensagem de teste";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o formato:");
        String tipo = scanner.nextLine();

        FormatarMensagem formatador = null;

        if ("MI".equals(tipo)) {
            formatador = new FormatarMensagemMinuscula();
        } else if ("MAI".equals(tipo)) {
            formatador = new FormatarMensagemMaiuscula();
        } else if ("DT".equals(tipo)) {
            formatador = new FormatarMensagemComDataHora();
        } else if ("CTR".equals(tipo)) {
            formatador = new FormatarMensagemAoContrario();
        }


        String mensagemFormatada = formatador.formatarMensagem(mensagem);

        System.out.println(mensagemFormatada);

    }


}
