package exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConverterDolaParaRealBigdecimal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Locale local = new Locale("en", "US");
        NumberFormat formataValores = NumberFormat.getCurrencyInstance(local);

        boolean continuar = true;
        do {
            System.out.print("Digite o valor da cotação do dólar: ");
            BigDecimal cotacaoDolar = new BigDecimal(leitor.nextLine());
            System.out.print("Digite o valor em reais: ");
            BigDecimal real = new BigDecimal(leitor.nextLine());
            BigDecimal dolar = real.divide(cotacaoDolar, 4, RoundingMode.HALF_EVEN);
            System.out.println("O valor em dólares é: " + formataValores.format(dolar));
            System.out.println("======================================================");
            System.out.println("Deseja fazer outra conversão? (S/N)");
            String sn = leitor.nextLine().toUpperCase(Locale.ROOT);
            if (sn.equals("S")){
                continuar = true;
            } else if (sn.equals("N")) {
                continuar = false;
            }
        } while (continuar);
    }
}
