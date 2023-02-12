package semana1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstruturaLogica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o mes:");
        int mes = Integer.parseInt(entrada.nextLine());

        if (mes == 0 || mes > 12){
            System.out.println("Valor invalido");
            System.exit(-1);
        }

        String mensagem = "";
        if (mes == 1){
            mensagem = "JANEIRO";
        } else if (mes == 2) {
            mensagem = "FEVEREIRO";
        } else if (mes == 3) {
            mensagem = "MARÇO";
        } else if (mes == 4) {
            mensagem = "ABRIL";
        } else if (mes == 5) {
            mensagem = "MAIO";
        } else if (mes == 6) {
            mensagem = "JUNHO";
        } else if (mes == 7) {
            mensagem = "JULHO";
        } else if (mes == 8) {
            mensagem = "AGOSTO";
        } else if (mes == 9) {
            mensagem = "SETEMBRO";
        } else if (mes == 10) {
            mensagem = "OUTUBRO";
        } else if (mes == 11) {
            mensagem = "NOVEMBRO";
        } else if (mes == 12) {
            mensagem = "DEZEMBRO";
        }else{
            mensagem = "";
        }

    }
}
