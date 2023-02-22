package exercicios;

import java.util.Scanner;

public class QuestaoNotaDaTurma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAlunos;
        double somaNotas = 0.0;
        double media;

//         Laço while
//         To fazendo o laço while porque no exercicio do Login eu esqueci de colocoar ( eu não prestei atençao no final do enunciado e so vi depois)
//        System.out.println("WHILE =============================================");
//        System.out.print("Quantos alunos há na turma? ");
//        numAlunos = entrada.nextInt();
//        int contador = 1;
//        while (contador <= numAlunos){
//            System.out.print("Digite a nota do aluno " + contador + ": ");
//            somaNotas = somaNotas + entrada.nextDouble();
//            contador++;
//        }
//        media = somaNotas / numAlunos;
//        System.out.println("A média da turma é: " + media);

        // laço for
        System.out.print("Quantos alunos há na turma? ");
        numAlunos = entrada.nextInt();
        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            somaNotas = somaNotas + entrada.nextDouble();
        }
            media = somaNotas / numAlunos;
        System.out.println("A média da turma é: " + media);


    }
}
