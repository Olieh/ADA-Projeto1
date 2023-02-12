package EstudoIndividual;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalMil {
    public static void main(String[] args) {
        // Definindo o valor monetário
        BigDecimal valor = new BigDecimal("123456.78");

        // Definindo a localidade para o Brasil
        Locale locale = new Locale("pt", "BR");

        // Criando um objeto NumberFormat para a localidade definida
        NumberFormat formatador = NumberFormat.getCurrencyInstance(locale);

        // Definindo o modo de arredondamento
        formatador.setRoundingMode(java.math.RoundingMode.HALF_UP);

        // Formatando o valor monetário
        String resultado = formatador.format(valor);

        // Exibindo o resultado
        System.out.println(resultado);
    }
}
