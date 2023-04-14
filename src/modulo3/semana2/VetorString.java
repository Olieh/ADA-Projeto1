package modulo3.semana2;

import java.util.Scanner;

public class VetorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe uma lista de nome, separando por ;");
        String nomes = scanner.nextLine();
        String[] listaNome = nomes.split(";");

        String nome1 = listaNome[0];
        double preco1 = Double.parseDouble(listaNome[1]);
        String nome2 = listaNome[2];
        double preco2 = Double.parseDouble(listaNome[3]);

        if (preco1 > preco2) {
            System.out.printf("Produto mais caro é o %s com valor %.2f",nome1,preco1);
            System.out.printf("\nProduto mais barato é o %s com valor %.2f",nome2,preco2);
        } else if (preco2 > preco1) {
            System.out.printf("Produto mais caro é o %s com valor %.2f",nome2,preco2);
            System.out.printf("\nProduto mais barato é o %s com valor %.2f",nome1,preco1);
        } else {
            System.out.printf("Ambos produtos, %s e %s, possuem o mesmo valor %.2f",nome1,nome2,preco1);
        }


    }
}
// Em geral, usamos os caracteres ‘s’, ‘d’ e ‘f’ para strings,
// inteiros e números de ponto flutuante, respectivamente.
