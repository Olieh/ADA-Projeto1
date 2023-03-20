package modulo2.parte7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
//    ENTRADA DE DADOS NO OBJETO
    Empregado empregado1 = new Empregado("empregado1",100, BigDecimal.valueOf(1000.50d));
    Empregado empregado2 = new Empregado("empregado2",200, BigDecimal.valueOf(2000.50d));
    Empregado empregado3 = new Empregado("empregado3",300, BigDecimal.valueOf(3000.50d));

//    CRIAÇÃO DE UMA LISTA EM ARRAYLIST, INSERINDO OS OBJETOS
        List<Empregado> listaF1rst = new ArrayList<>();
        listaF1rst.add(empregado3);
        listaF1rst.add(empregado2);
        listaF1rst.add(empregado1);

//        EXIBIÇÃO DOS DADOS ANTES DA ORDENAÇÃO
        for (Empregado lista : listaF1rst) {
            // nao faz muito sentido fazer essa busca de indice
            System.out.println(listaF1rst.indexOf(lista));
            System.out.println(lista);
        }

        System.out.println("\n");
        for (int i = 0; i < listaF1rst.size(); i++) {
            Empregado empregado = listaF1rst.get(i);
            System.out.println("O índice do elemento " + empregado + " é " + i);
        }

        System.out.println("\n");
        Collections.sort(listaF1rst);
        for (Empregado empregado : listaF1rst) {
            System.out.println(empregado);
        }
    }
}
