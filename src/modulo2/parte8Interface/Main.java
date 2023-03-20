package modulo2.parte8Interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* INTERFACES
  * Se trata de um "contrato" que grandes aplicações fazem para que o
  programador siga o padrão do projeto definido no início do
  desenvolvimento.
  *
  * 1-> Declara com a palavra reservada interface
  * 2-> Só pode conter as assinaturas dos métodos, sem corpo
  * 3-> Só pode conter variáveis constantes (aquelas declaradas
     como static ou final)
  * 4-> Não pode ser instanciada
  * 5-> A classe que a implementar deve obrigatoriamente implementar
    também todos os seus métodos
  * 6-> Uma classe pode ter diversas interfaces (diferentemente da herança)
 *    EX:   public class ContaCorrente extends Conta (HERANÇA)
 *          public class ContaCorrente implements Conta, Usuario (INTERFACE)
 */
public class Main {
    public static void main(String[] args) {
        Produto sabao = new Produto("Sabão Liquido", "Omo",29.30);
        Produto arroz = new Produto("Arroz 5 KG", "Carreteiro",19.30);
        Produto feijao = new Produto("Feijão 1 KG", "Carreteiro",7.90);
        Produto sabao2 = new Produto("Sabão Liquido", "Ariel",25.30);
        // Criar uma lista desses objetos
        // List é a interface, ArrayList é a implementação
        List<Produto> meuCarrinho = new ArrayList<>();
        // Preencher a lista
        meuCarrinho.add(feijao);
        meuCarrinho.add(sabao2);
        meuCarrinho.add(sabao);
        meuCarrinho.add(arroz);
        System.out.println("Lista Não Ordenada:");
        for (Produto listaOrd : meuCarrinho){
            System.out.println(listaOrd);
        }
        // Classificação da lista
        Collections.sort(meuCarrinho);

        System.out.println("\nLista Ordenada:");
        for (Produto listaOrd : meuCarrinho){
            System.out.println(listaOrd);
        }
    }
}