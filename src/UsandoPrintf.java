import java.util.Scanner;

public class UsandoPrintf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome:");
        String nome = scanner.nextLine();
        System.out.print("Informe a idade:");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.printf("1º - Ola %s, sua idade é %d", nome, idade);

//        Formatacao de saida
//        s – formats strings
//        d – formats decimal integers
//        f – formats the floating-point numbers
//        t – formats date/time values

        String mensagem = String.format("\n2º - Ola %s, sua idade é %d", nome, idade);
        System.out.println(mensagem);
    }
}
