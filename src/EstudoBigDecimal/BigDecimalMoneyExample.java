package EstudoBigDecimal;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalMoneyExample {
    public static void main(String[] args) {
        Locale local = new Locale("pt", "BR");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(local);

        BigDecimal num1 = new BigDecimal("10.50");
        BigDecimal num2 = new BigDecimal("20.75");

        // Adição
        BigDecimal sum = num1.add(num2);
        System.out.println("Sum: " + currencyFormat.format(sum));

        // Subtração
        BigDecimal difference = num1.subtract(num2);
        System.out.println("Difference: " + currencyFormat.format(difference));

        // Multiplicação
        BigDecimal product = num1.multiply(num2);
        System.out.println("Product: " + currencyFormat.format(product));

        // Divisão
        BigDecimal quotient = num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Quotient: " + currencyFormat.format(quotient));
    }
}

