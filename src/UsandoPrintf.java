import java.util.Scanner;

public class UsandoPrintf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome:");
        String nome = scanner.nextLine();
        System.out.print("Informe a idade:");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.printf("Ola %s, sua idade é %d", nome, idade);
    }
}
