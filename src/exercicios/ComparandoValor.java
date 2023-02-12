package exercicios;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ComparandoValor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Locale local = new Locale("PT", "BR");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(local);

        System.out.println("Produto 1");
        System.out.print("Informe o nome do produto:");
        String nomeProduto1 = leitor.nextLine();
        System.out.print("Informe o valor:");
        BigDecimal valorProduto1 = new BigDecimal(leitor.nextLine());
        System.out.println("======================");

        System.out.println("Produto 2");
        System.out.print("Informe o nome do produto:");
        String nomeProduto2 = leitor.nextLine();
        System.out.print("Informe o valor:");
        BigDecimal valorProduto2 = new BigDecimal(leitor.nextLine());

        int result = valorProduto1.compareTo(valorProduto2);

        if (result == 0) {
            System.out.println("Os valores são iguais");
        } else if (result == 1) {
            System.out.println("O valor do produto \""+nomeProduto1+"\" é mais caro, custando "+currencyFormat.format(valorProduto1));
        } else {
            System.out.println("O valor do produto \""+nomeProduto2+"\" é mais caro, custando "+currencyFormat.format(valorProduto2));
        }
    }
}
