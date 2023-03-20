package modulo2.trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
    public static Scanner leitor;
    public static ArrayList<Conta> listaConta;

    public static void main(String[] args) {
        int opcaoMenu = 0;
        leitor = new Scanner(System.in);
        listaConta = new ArrayList<Conta>();

//        Conta conta1 = new ContaPoupanca("nome1", 21, "11111111111", "11111", 0, "111");
//        Conta conta2 = new ContaPoupanca("nome2", 22, "22222222222", "22222", 0, "222");
//        Conta conta3 = new ContaPoupanca("nome3", 23, "33333333333", "33333", 0, "333");
//        Conta conta4 = new ContaCorrente("nome4", 24, null, "44444444444", "44444", 0, "444");
//        Conta conta5 = new ContaCorrente("nome5", 25, null, "55555555555", "55555", 0, "555");
//        Conta conta6 = new ContaCorrente("nome6", 0, "6666666666666", null, "66666", 0, "666");
//        Conta conta7 = new ContaCorrente("nome7", 0, "7777777777777", null, "77777", 0, "777");
//        Conta conta8 = new ContaInvestimento("nome8", 28, null, "88888888888", "88888", 0, "888");
//        Conta conta9 = new ContaInvestimento("nome9", 0, "9999999999999", null, "99999", 0, "999");
//        listaConta.add(conta1);
//        listaConta.add(conta2);
//        listaConta.add(conta3);
//        listaConta.add(conta4);
//        listaConta.add(conta5);
//        listaConta.add(conta6);
//        listaConta.add(conta7);
//        listaConta.add(conta8);
//        listaConta.add(conta9);

        do {
            // opcaoMenu    -->     [1 = abrir conta]      [2 = logar]     [0 = sair]
            opcaoMenu = getOpcaoMenu();
            switch (opcaoMenu) {
                case 1:
                    int tipoPessoa = 0;
                    do {
                        // tipoPessoa   -->  [1 - Pessoa Fisica]       [2 - Pessoa Juridica]
                        tipoPessoa = getTipoPessoa();
                        if (tipoPessoa == 1) {
                            cadastrarContaPF();
                        } else if (tipoPessoa == 2) {
                            cadastrarContaPJ();
                        }
                    } while (tipoPessoa != 0);
                    break;
                case 2:
                    System.out.println("### Login ##################################");
                    System.out.println("CPF ou CNPJ:");
                    String login = leitor.nextLine();
                    System.out.println("Senha:");
                    String senha = leitor.nextLine();
                    for (Conta conta : listaConta) {
                        if (conta.getCNPJ() != null) {
                            if (conta.getCNPJ().equals(login)) {
                                if (conta.getSenha().equals(senha)) {
                                    menuConta(conta);
                                }
                            }
                        } else {
                            if (conta.getCPF().equals(login)) {
                                if (conta.getSenha().equals(senha)) {
                                    menuConta(conta);
                                }
                            }
                        }
                    }
                    System.out.println("###########################################");
                    break;
                case 3:
                    System.out.println("###########################################");
                    System.out.println("Lista:");
                    for (Conta conta : listaConta) {
                        System.out.println(conta);
                    }
                    System.out.println("###########################################");
                    break;
            }
        } while (opcaoMenu != 0);
    }

    private static void cadastrarContaPJ() {
        System.out.println("### Pessoa Juridica ########################");
        int tipoConta = 0;
        // tipoContaPJ    -->      [1 - conta Corrente]        [2 - conta Investimento]
        tipoConta = getTipoConta(1);
        System.out.println("Informe o nome:");
        String nome = leitor.nextLine();
        System.out.println("Informe o CNPJ:");
        String cnpj = leitor.nextLine();
        System.out.println("Informe o nº da conta:");
        String matricula = leitor.nextLine();
        System.out.println("Informe senha:");
        String senha = leitor.nextLine();
        Conta conta = new Conta();
        if (tipoConta == 1) {
            conta = new ContaCorrente(nome, 0, cnpj, null, matricula, 0, senha);
        } else if (tipoConta == 2) {
            conta = new ContaInvestimento(nome, 0, cnpj, null, matricula, 0, senha);
        }
        listaConta.add(conta);
    }

    private static void cadastrarContaPF() {
        System.out.println("### Pessoa Fisica ##########################");
        int tipoConta = 0;
        // tipoConta    -->     [1 - conta Poupança]    [2 - conta Corrente]    [3 - conta Investimento]
        tipoConta = getTipoConta("a");
        System.out.println("Informe o nome:");
        String nome = leitor.nextLine();
        System.out.println("Informe a idade:");
        int idade = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe o CPF:");
        String cpf = leitor.nextLine();
        System.out.println("Informe o nº da conta:");
        String matricula = leitor.nextLine();
        System.out.println("Informe senha:");
        String senha = leitor.nextLine();
        Conta conta = new Conta();
        if (tipoConta == 1) {
            conta = new ContaPoupanca(nome, idade, cpf, matricula, 0, senha);
        } else if (tipoConta == 2) {
            conta = new ContaCorrente(nome, idade, null, cpf, matricula, 0, senha);
        } else if (tipoConta == 3) {
            conta = new ContaInvestimento(nome, idade, null, cpf, matricula, 0, senha);
        }
        listaConta.add(conta);
    }

    // SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA
    private static int getTipoConta(String letra) {
        int tipoConta;
        do {
            System.out.println("Informe o tipo de conta PF:");
            System.out.println("[1] - Conta Poupança");
            System.out.println("[2] - Conta Corrente");
            System.out.println("[3] - Conta Investimento");
            tipoConta = Integer.parseInt(leitor.nextLine());
        } while (!(tipoConta == 1 || tipoConta == 2 || tipoConta == 3));
        return tipoConta;
    }

    // SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA
    private static int getTipoConta(int numero) {
        int tipoConta;
        do {
            System.out.println("Informe o tipo de conta PJ:");
            System.out.println("[1] - Conta Corrente");
            System.out.println("[2] - Conta Investimento");
            tipoConta = Integer.parseInt(leitor.nextLine());
        } while (!(tipoConta == 1 || tipoConta == 2));
        return tipoConta;
    }

    private static int getTipoPessoa() {
        int tipoPessoa;
        System.out.println("### TIPO DE PESSOA ########################");
        System.out.println("[0] - Sair");
        System.out.println("[1] - Pessoa Fisica");
        System.out.println("[2] - Pessoa Juridica ");
        System.out.println("###########################################");
        tipoPessoa = Integer.parseInt(leitor.nextLine());
        return tipoPessoa;
    }

    private static int getOpcaoMenu() {
        // TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH
        try {
            System.out.println("### MENU PRINCIPAL ########################");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Abrir conta ");
            System.out.println("[2] - Logar ");
            System.out.println("[3] - Mostrar Lista de Conta ");
            System.out.println("###########################################");
            return Integer.parseInt(leitor.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Houve uma exceção de formatação no MENU PRINCIPAL ");
            return 0;
        }
    }

    private static void menuConta(Conta conta) {
        int op = 0;
        do {
            double valor = 0;
            System.out.println("### MENU ##################################");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Sacar ");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Transferencia");
            System.out.println("[4] - Consultar saldo");
            System.out.println("###########################################");
            op = Integer.parseInt(leitor.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Informe o valor que deseja sacar:");
                    System.out.print("R$: ");
                    valor = Integer.parseInt(leitor.nextLine());
                    conta.sacar(valor);
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja depositar:");
                    System.out.print("R$: ");
                    valor = Integer.parseInt(leitor.nextLine());
                    conta.depositar(valor);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    System.out.print("R$: ");
                    valor = Integer.parseInt(leitor.nextLine());
                    System.out.println("Informe o nº da matricula da conta onde deseja depositar:");
                    Conta contaBuscado = BuscarConta(leitor.nextLine());
                    if (contaBuscado != null){
                    conta.transferencia(contaBuscado, valor);
                    }else{
                        System.out.println("Conta de destino nao encontrada!");
                    }
                    break;
                case 4:
                    conta.consultarSaldo();
                    break;
            }
        } while (op != 0);
    }

    private static Conta BuscarConta(String contaBuscada) {
        for (Conta conta : listaConta) {
            if (conta.getMatricula().equals(contaBuscada)) {
                return conta;
            }
        }
        return null;
    }

}
