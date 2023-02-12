package EstudoIndividual;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExemplo2 {

//    COMO DECLARAR DE FORMA CORRETA: "0.1" e "0.2"
//    public static void main(String[] args) {
//        BigDecimal big1 = new BigDecimal("0.1");
//        BigDecimal big2 = new BigDecimal("0.2");
//        BigDecimal bigResult = big1.add(big2);
//        System.out.println(bigResult.toString());
//    }

//    ERRO! - definir o parametro do BigDecimal como numero sem as "" (aspas), causa um resultado : 0.3000000000000000166533453693773481063544750213623046875
//    public static void main(String[] args) {
//        BigDecimal big1 = new BigDecimal(0.1);
//        BigDecimal big2 = new BigDecimal(0.2);
//        BigDecimal bigResult = big1.add(big2);
//        System.out.println(bigResult.toString());
//
//    }

//    OPERAÇÕES ARITMÉTICAS COM BIGDECIMAL
    public static void main(String[] args) {
        System.out.println("Subtrai");
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));

        System.out.println("------------");
        System.out.println("Soma");
        System.out.println(new BigDecimal("2.00").add(new BigDecimal("1.2")));

        System.out.println("------------");
        System.out.println("Compara");
        System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("1.3")));

        System.out.println("------------");
        System.out.println("Divide");
        System.out.println(new BigDecimal("2.00").divide(new BigDecimal("2.00"), 4, RoundingMode.HALF_UP));

        System.out.println("------------");
        System.out.println("Máximo");
        System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

        System.out.println("------------");
        System.out.println("Mínimo");
        System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

        System.out.println("------------");
        System.out.println("Potência");
        System.out.println(new BigDecimal("2.00").pow(2));

        System.out.println("------------");
        System.out.println("Multiplica");
        System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.8")));
    }

}
