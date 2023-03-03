package exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class QuestaoCalculoIdade {
    private static Scanner leitor;
    final static int MAIOR_DE_IDADE = 18;

    public static void main(String[] args) {
        leitor = new Scanner(System.in);
        System.out.print("Informe o ano de nascimento:");
        try {
            if (eDeMaior(retornaIdade(Integer.parseInt(leitor.nextLine())))) {
                imprime("Acesso Liberado");
            } else {
                imprime("Acesso Negado");
            }
        } catch (Exception e) {
            imprime("HOUVE UMA EXCEÇÃO ---> " + e.getMessage());
            e.getMessage();
            main(args);
        }finally {
            imprime("Fim da mensagem");
            leitor.close();
        }
    }

    public static int retornaIdade(int anoNascimento) {
        Calendar calendario = Calendar.getInstance();
        return ((calendario.get(Calendar.YEAR)) - anoNascimento);
    }

    public static boolean eDeMaior(int idade) {
        return idade >= MAIOR_DE_IDADE;
    }

    public static void imprime(String mensagem) {
        System.out.println(mensagem);
    }

}
