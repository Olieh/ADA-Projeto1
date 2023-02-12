package exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Questao1ScannerMelhorSolução {

//--ENUNCIADO------------------------------------------------------------------------
//    1º - Crie um programa que solicite os dados do usuario:
//      Nome
//      Cidade
//      Ano de nascimento
//-----------------------------------------------------------------------------------
//    2º - Calcule a idade da pessoa e final imprima a seguinte mensagem:
//      "Ola, NOME. A sua idade é IDADE anos. A sua cidade é CIDADE".
//
//    Exemplo:
//      ENTRADA:
//          Nome: Rodrigo
//          Cidade: Sao Paulo
//          Ano de nascimento: 1984
//      SAIDA:
//          "Ola, Rodrigo. A sua idade é 39 anos. A sua cidade é Sao Paulo".
//-----------------------------------------------------------------------------------

    public static void main(String[] args) {

        //ENTRADA-DE-DADOS----------------------------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o nome da cidade em que nasceu: ");
        String cidade = entrada.nextLine();

        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o nome de sua mãe: ");
        String mae = entrada.nextLine();

        //PROCESSAMENTO-DE-DADOS----------------------------------------------------------------------------------------
        Calendar cal = Calendar.getInstance();
        int anoatual = cal.get(Calendar.YEAR);
        int idade = anoatual - anoNascimento;


        //SAIDA-DE-DADOS------------------------------------------------------------------------------------------------
        System.out.println("RESULTADO DA MENSAGEM: Ola, " + nome + ". A sua idade é " + idade + " anos. A sua cidade é " + cidade + ". O nome da sua mãe é " + mae);


    }
}
