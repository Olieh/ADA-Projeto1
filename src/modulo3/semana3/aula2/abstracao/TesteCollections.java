package br.com.ada.first973.aulas.revisaoPOO.abstracao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class TesteCollections {

    public static void main(String[] args) {

        Collection<String> nomes = new HashSet<>();
        nomes.add("Rodrigo");
        nomes.add("Anderson");
        nomes.add("Igor");
        nomes.add("Lucas");
        nomes.add("Tais");
        nomes.add("Tais");
        nomes.add("Wallace");
        nomes.add("Wallace");

        for(String nome : nomes) {
            System.out.println(nome);
        }

    }

}
