package exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConverterDolarParaReal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        @SuppressWarnings("deprecation")
        Locale local = new Locale("en", "US");
        NumberFormat formataValores = NumberFormat.getCurrencyInstance(local);

        System.out.print("Digite o valor da cotação do dólar: ");
        BigDecimal cotacaoDolar =  new BigDecimal(leitor.nextLine());

        System.out.print("Digite o valor em reais: ");
        BigDecimal real =  new BigDecimal(leitor.nextLine());

        BigDecimal dolar = real.divide(cotacaoDolar, 4, RoundingMode.HALF_EVEN);

        System.out.println("O valor em dólares é: " + formataValores.format(dolar));

    }
}
// Observação: o dolar no Google Finanças está com o valor = 5.2151
// https://www.google.com/finance/quote/USD-BRL?sa=X&ved=2ahUKEwiFp7X2gY_9AhXrrJUCHakYAPIQmY0JegQIBhAd
// Percebi que quando fazemos coversão a partir de 1500 reais, o valor em dolar começa a ficar diferente quando comparado com o valor do Google.
// Acredito que seja necessario uma maior precisão do valor da cotação do dolar, mas não tenho certeza
