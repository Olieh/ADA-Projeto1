package EstudoBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExemplo1 {
    public static void main(String[] args) {
//        Não usar double e float para representar valores exatos como moedas
//        Forma correta de usar BigDecimal:
        BigDecimal valor1 = new BigDecimal("2.50");
        BigDecimal valor2 = BigDecimal.valueOf(0.25);

        System.out.println("---------------------");
        System.out.println("valor1 = "+valor1);
        System.out.println("valor2 = "+valor2);
        System.out.println("---------------------");

        BigDecimal valor3 = BigDecimal.valueOf(1000.25121);
//        Primeiro paramentro indica a quantidade de casas decimais
//        Segundo paramentro de arredondamento

        System.out.println("Arredonda o numero em direção contraria do zero \n"+valor3.setScale(4, RoundingMode.UP));
//        | 5.5 --> 6
//        | 2.5 --> 3
//        | 1.6 --> 2
//        | 1.1 --> 2
//        | 1.0 --> 1
//        | -1.0 --> -1
//        | -1.1 --> -2
//        | -1.6 --> -2
//        | -2.5 --> -3
//        | -5.5 --> -6

        System.out.println("Arredonda x.4 para baixo \n Arredonda x.6 para cima \n Arredonda x.5 para o numero para mais proximo"+valor3.setScale(4, RoundingMode.HALF_EVEN));
//        | 1.7 --> 2
//        | 1.6 --> 2
//        | 1.5 --> 2
//        | 1.4 --> 1
//        | 1.3 --> 1
//        | 4.7 --> 5
//        | 4.6 --> 5
//        | 4.5 --> 4
//        | 4.4 --> 4
//        | 4.3 --> 4
//        é o padrão financeiro definido pelo banco central do brasil | norma ABNT 5891 = 4, RoundingMode.HALF_EVEN

//----------------------------------------------------------------------------------------------------------------------------------
        BigDecimal num1 = new BigDecimal("3");
        BigDecimal num2 = new BigDecimal("100");
        BigDecimal resultado = new BigDecimal("0");
        num1.setScale(4, RoundingMode.HALF_EVEN);
        num2.setScale(4, RoundingMode.HALF_EVEN);
        resultado.setScale(4, RoundingMode.HALF_EVEN);

        resultado = num1.add(num2);
        System.out.println("Adição: "+resultado.toPlainString());

        resultado = num1.subtract(num2);
        System.out.println("Subtração: "+resultado.toPlainString());

        resultado = num1.multiply(num2);
        System.out.println("Multiplicação: "+resultado.toPlainString());

        resultado = num1.divide(num2, RoundingMode.HALF_EVEN);
        System.out.println("Divisão: "+resultado.toPlainString());

//----------------------------------------------------------------------------------------------------------------------------------

        if (num1.compareTo(num2) < 0){
            System.out.println("O primeiro numero é menor que o segundo numero");
        }

        if (num1.compareTo(num2) == 0){
            System.out.println("O primeiro numero é igual que o segundo numero");
        }

        if (num1.compareTo(num2) != 0){
            System.out.println("O primeiro numero é diferente do segundo numero");
        }

        if (num1.compareTo(num2) > 0){
            System.out.println("O primeiro numero é maior que o segundo numero");
        }

//----------------------------------------------------------------------------------------------------------------------------------

//        per | capital | juros | montante
//        1     3000        3       3090
//        2     3090        3       3182,70
        String txtCapital = "3000";
        String txtTaxaDeJuros = "3";
        String txtPeriodo = "1";

        BigDecimal capital = converterParaBigDecimal(txtCapital);
        BigDecimal taxaDeJuros = converterParaBigDecimal(txtTaxaDeJuros);
        BigDecimal Periodo = converterParaBigDecimal(txtPeriodo);

        BigDecimal montante = taxaDeJuros.divide(new BigDecimal("100"), RoundingMode.HALF_EVEN);
        System.out.println("montante1:"+montante);

    }

    private static BigDecimal converterParaBigDecimal(String valor) {
        try {
            return new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);
        } catch (Exception ex){
            return BigDecimal.ZERO;
        }
    }


}
