package EstudoBigDecimal;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatandoDinheiroComDouble {
    public static void main(String[] args) {
        Locale local = new Locale("pt", "BR");
        NumberFormat formatador = NumberFormat.getCurrencyInstance(local);

        double valor = 22.552;

        System.out.println("Valor: " + formatador.format(valor));
    }
}

