package semana1;

import java.util.Scanner;

public class CompararString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome:");
        String nomeInformado = scanner.nextLine();

//        FORMA ERRADA DE COMPARAR A STRING RECEBIDO PELO USUARIO PELO "Joao"
//        if (nomeInformado == "Joao"){
//            System.out.println("Sim, é o Joao");
//        }else {
//            System.out.println("Não, não é o Joao");
//        }

//        FORMA CORRETA É USANDO EQUAUS
        if (nomeInformado.equals("Joao")) {
            System.out.println("Sim, é o Joao");
        } else {
            System.out.println("Não, não é o Joao");
        }

    }
}
