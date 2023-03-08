package modulo2.parte3heranca;

// Mostrar na tela todos os dados inseridos e calculados.
// Criar, além do menu principal, a opção do usuário SAIR

import java.util.Scanner;

public class MenuPrincipal {
    static Administrador administrador;
    static Estagiario estagiario;
    static Gerente gerente;
    static Scanner leitor;
    static String opcao;

    public static void main(String[] args) {
        boolean sair = true;
        leitor = new Scanner(System.in);
        while (sair) {
            System.out.println("Informe a letra do tipo de cadastro que deseja realizar: ");
            System.out.println("[a] --> Administrador");
            System.out.println("[e] --> Estagiario");
            System.out.println("[g] --> gerente");
            opcao = leitor.nextLine();

            switch (opcao.toLowerCase()) {
                case "a":
                    administrador = new Administrador();
                    System.out.print("Informe o nome: ");
                    administrador.setNome(leitor.nextLine());
                    System.out.print("Informe a idade: ");
                    administrador.setIdade(Integer.parseInt(leitor.nextLine()));
                    System.out.print("Informe o bairro: ");
                    administrador.setBairro(leitor.nextLine());
                    System.out.print("Informe o valor da hora trabalhada: ");
                    administrador.setValorHora(Double.parseDouble(leitor.nextLine()));
                    System.out.print("Informe a hora trabalhada: ");
                    administrador.setHorasDiariaTrabalhada(Integer.parseInt(leitor.nextLine()));
                    administrador.setSalario(administrador.getValorHora() * administrador.getHorasDiariaTrabalhada());
                    System.out.println("--------------------");
                    System.out.println("RESULTADO DO OBJETO: ");
                    System.out.println(administrador.toString());
                    break;
                case "e":
                    estagiario = new Estagiario();
                    System.out.print("Informe o nome: ");
                    estagiario.setNome(leitor.nextLine());
                    System.out.print("Informe a idade: ");
                    estagiario.setIdade(Integer.parseInt(leitor.nextLine()));
                    System.out.print("Informe o bairro: ");
                    estagiario.setBairro(leitor.nextLine());
                    System.out.print("Informe a quantidade de horas que estagia na semana: ");
                    estagiario.setHorasSemanaEstagiou(Integer.parseInt(leitor.nextLine()));
                    System.out.print("Informe quantos meses estágiou: ");
                    estagiario.setMesesEstagiou(Integer.parseInt(leitor.nextLine()));
                    estagiario.setHorasEstagiou(4 * estagiario.getHorasSemanaEstagiou() * estagiario.getMesesEstagiou());
                    estagiario.setHorasDiariaTrabalhada(estagiario.getHorasSemanaEstagiou()/5);
                    System.out.println("--------------------");
                    System.out.println("RESULTADO DO OBJETO: ");
                    System.out.println(estagiario.toString());
                    break;
                case "g":
                    gerente = new Gerente();
                    System.out.print("Informe o nome: ");
                    gerente.setNome(leitor.nextLine());
                    System.out.print("Informe a idade: ");
                    gerente.setIdade(Integer.parseInt(leitor.nextLine()));
                    System.out.print("Informe o bairro: ");
                    gerente.setBairro(leitor.nextLine());
                    System.out.print("Informe a hora trabalhada: ");
                    gerente.setHorasDiariaTrabalhada(Integer.parseInt(leitor.nextLine()));
                    gerente.setHorasMais(gerente.getHorasDiariaTrabalhada() - gerente.getHORASEMANA());

                    System.out.println("--------------------");
                    System.out.println("RESULTADO DO OBJETO: ");
                    System.out.println(gerente.toString());
                    break;
                default:
                    break;
            }
            System.out.println("======================================================");
            System.out.println("Deseja sair do programa?");

            if ("S".equals(leitor.nextLine().toUpperCase())) {
                break;
            };
        }
    }
}
