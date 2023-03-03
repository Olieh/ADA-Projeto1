package exercicios;

public class QuestaoArray {
    public static void main(String[] args) {
        String[] filmes = new String[]{"Piratas do Caribe", null, "Crepúsculo", "Harry Potter", "O Senhor dos Anéis", "Star Wars", "O Dia do Terror"};
        String[] livros = new String[]{"Crepúsculo", "Harry Potter", "Star Wars", null, "Gossip Girl"};
        int contFilme = 0;
        while1:
        while (contFilme < filmes.length) {
            int contLivros = 0;
            if (filmes[contFilme] == null) {
                contFilme++;
                continue;
            }
            while2:
            while (contLivros < livros.length) {
                if (livros[contLivros] == null) {
                    contLivros++;
                    continue;
                }
                if (filmes[contFilme].equals(livros[contLivros])) {
                    System.out.println("O filme " + filmes[contFilme] + " possui também o livro " + filmes[contFilme] + ".");
//                    break while1;
                    break;
                }
                contLivros++;
                System.out.println("processando " + contLivros + " ...");
            }
            contFilme++;
        }

        System.out.println("IMPRIMIR OS LIVROS E OS FILMES =========================");
        System.out.println("IMPRIMIR LIVROS--------------");
        imprimirArray(livros);
        System.out.println("IMPRIMIR FILMES--------------");
        imprimirArray(filmes);
    }

    static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
