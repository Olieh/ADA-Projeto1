package br.com.ada.first973.aulas.revisaoPOO;

import java.util.Objects;

public class TesteHashCode {

    public static void main(String[] args) {

        int x = 0;
        Integer x2 = 0;  //wrapper

        System.out.println(x);
        System.out.println(x2.intValue());

        double d = 0;
        Double d2 = Double.parseDouble("0");

        double d2value = d2.doubleValue();

        float f = 0;
        Float f2 = 0f;

        Carro carro1 = new Carro();
        carro1.setModelo("Gol");
        carro1.setMarca("Volks");
        carro1.setTipoCarro(TipoCarro.PASSEIO);

        Carro carro2 = new Carro();
        carro2.setModelo("Gol");
        carro2.setMarca("Volks");
        carro2.setTipoCarro(TipoCarro.PASSEIO);

        System.out.println("carro1 = " + carro1);
        System.out.println("carro2 = " + carro2);

        System.out.println("carro1 = " + carro1.hashCode());
        System.out.println("carro2 = " + carro2.hashCode());

        System.out.println( Objects.equals(carro1, carro2) );
        System.out.println(carro1.equals(carro2));
        System.out.println(carro1 == carro2);

        Objects.equals("string1", "string2");

        /*
        carro2.setModelo("Palio");
        System.out.println("carro2 = " + carro2.hashCode());
        System.out.println(carro1.equals(carro2));
         */

        System.out.println( equals(carro1, carro2) );

        equals("string1", "string2");

    }

    static boolean equals(Object a, Object b) {
        return a.equals(b);
    }

}
