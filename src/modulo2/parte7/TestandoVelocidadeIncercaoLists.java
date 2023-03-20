package modulo2.parte7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.UUID;

public class TestandoVelocidadeIncercaoLists {
    /* Java Collection Framework
     *  é um conjunto bem definido de interfaces de classes, para representar e tratar grupos de dados como uma unica "unidade"
     *
     * Collection --> Interface principal da hierarquia
     *
     * Set --> Interface que define uma coleção que não permite elementos duplicados.
     *
     * List --> define uma coleção ordenada, podendo conter elementos duplicados
     *
     * ArrayList: é como um array cujo tamanho pode ir crescendo, permite uma busca rapida dentro do array, porem as inclusoes e exclusoes sao lineares
     *
     * LinkedList --> implemente uma lista "ligada", ou seja, cada no contem o dado e uma refencia para o proximo no. A busca é mais lenta, porem incluir ou excluir dados é mais rapido.
     * */

    public static void main(String[] args) {
        cronometrar(() -> {
            LinkedList<String> listaDeNomes = new LinkedList<String>();
            for (int i = 0; i < 100000; i++) {
                listaDeNomes.add(i, UUID.randomUUID().toString());
            }
        });

        cronometrar(() -> {
            ArrayList<String> listaDeNomes2 = new ArrayList<>();
            for (int i = 0; i < 100000; i++) {
                listaDeNomes2.add(i, UUID.randomUUID().toString());
            }
        });
    }

    /*
    Podemos usar a classe System para obter o tempo atual em milissegundos
    antes e depois da execução do seu programa e, em seguida, calcular a
    diferença para determinar o tempo total de execução.
    * */
    public static void cronometrar(Runnable runnable) {
        long inicio = System.currentTimeMillis();
        runnable.run();
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + " ms");
    }
}
