package modulo3.semana3.aula4.collections;

import modulo3.semana3.aula4.Carro;

import java.util.ArrayList;

public class AulaCollections {

    public static void main(String[] args) {

        ArrayList<Carro> carros = new ArrayList();

        Carro fiat = new Carro();
        fiat.setMarca("Fiat");
        carros.add(fiat);

        Carro volks = new Carro();
        volks.setMarca("Volks");
        carros.add(volks);

        for (Carro carro : carros) {
            System.out.println(carro);
        }




    }

}
