package modulo3.semana3.aula1;

import java.util.Scanner;

public class testeArray {
    //    Exercício: Solicitar ao usuário uma quantidade de nomes que ele
//    deseja inserir em um array. Depois, o programa deve solicitar
//    essa quantidade de nomes, um a um, ao usuário. Ao final, exibir
//    essa lista de nomes na tela
//    Adendo: imprimir os nomes na tela em maiúsculo
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a quantidade de nomes que serão inserido:");
        int qtd = Integer.parseInt(leitor.nextLine());
        String[] listaNomes = new String[qtd];

        int cont = 0;
        while (cont < qtd){
            System.out.print("Informe o nome"+(cont+1)+" : ");
            listaNomes[cont] = leitor.nextLine().toUpperCase();
            cont++;
        }

        cont = 0;
        while (cont < qtd){
            System.out.println(listaNomes[cont]);
            cont++;
        }
    }
}
