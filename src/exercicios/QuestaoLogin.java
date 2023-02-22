package exercicios;

import java.util.Scanner;

//    Enunciado
//    Crie um programa que solicite uma senha para o usuario.
//    Se a senha for incorreta o programa deve mostrar a mensagem "Senha incorreta" e solicitar a senha para o usuario novamente.
//    Se a senha for correta mostrar a mensagem "Senha correta, bem vindo." e encerrar o programa.
//
//    Dicas:
//    usar while ou do..while para solicitar a senha do usuario até o usuaria acertar a senha.
public class QuestaoLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "abc";
        String senha = "a1";
        String entradaLogin;
        String entradaSenha;


        System.out.print("Login: ");
        entradaLogin = sc.nextLine();

        System.out.print("Senha: ");
        entradaSenha = sc.nextLine();

        if (entradaSenha.equals(senha) && entradaLogin.equals(login)) {
            System.out.println("Senha correta, bem vindo.");
        } else {
            System.out.println("Senha incorreta.");
        }

    }
}
