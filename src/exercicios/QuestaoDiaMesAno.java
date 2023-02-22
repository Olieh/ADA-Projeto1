package exercicios;

import java.util.Scanner;

public class QuestaoDiaMesAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a data no formato DIA-MES-ANO");
        String data = scanner.nextLine();
        String[] listaString = data.split("-");
        if (Integer.parseInt(listaString[1]) > 0 || Integer.parseInt(listaString[1]) < 13) {
            String mes = "";
            switch (Integer.parseInt(listaString[1])) {
                case 1:
                    mes = "Janeiro";
                    break;
                case 2:
                    mes = "Fevereiro";
                    break;
                case 3:
                    mes = "Março";
                    break;
                case 4:
                    mes = "Abril";
                    break;
                case 5:
                    mes = "Maio";
                    break;
                case 6:
                    mes = "Junho";
                    break;
                case 7:
                    mes = "Julho";
                    break;
                case 8:
                    mes = "Agosto";
                    break;
                case 9:
                    mes = "Setembro";
                    break;
                case 10:
                    mes = "Outubro";
                    break;
                case 11:
                    mes = "Novembro";
                    break;
                case 12:
                    mes = "Dezembro";
                    break;
            }
            System.out.printf("%s de %s de %s", listaString[0], mes, listaString[2]);
        }
    }
}