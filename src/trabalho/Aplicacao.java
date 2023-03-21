package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

/*
    herança         = (Classe) Conta herda de (Classe) Pessoa
    encapsulamento  = (Classe) Conta & Pessoa
    sobrecarga      = (Classe) Aplicação --> (metodos) cadastrarContaPF() & cadastrarContaPJ()
    sobrescrita     = (Classe) ContaPoupanca --> (metodos) depositar() & sacar() & transferencia()
    classe abstrata = (Classe) Pessoa
    arrays          = (Classe) Aplicação --> listaConta = new ArrayList<Conta>()
    try catch       = (Classe) Aplicação --> (metodo) capturaOpcaoMenu()

    obs: descomentar nessa Classe o (metodo) popularListaConta() para fazer os testes;
 */
public class Aplicacao {
    public static Scanner leitor;
    public static ArrayList<Conta> listaConta;

    public static void main(String[] args) {
        leitor = new Scanner(System.in);
        listaConta = new ArrayList<Conta>();
        int opcaoMenu = 0;

//        popularListaConta();
        menuPrincipal:
        while (true) {
            // opcaoMenu    -->     [0 = sair]    [1 = abrir conta]      [2 = logar]    [3 - mostrar a lista de conta]
            opcaoMenu = capturaOpcaoMenu();
            switch (opcaoMenu) {
                case 0:
                    System.out.println("########################################################################################");
                    System.out.println("Saindo do Menu...");
                    break menuPrincipal;
                case 1:
                    int tipoPessoa = 0;
                    menuAberturaConta:
                    while (true) {
                        // tipoPessoa   -->  [1 - Pessoa Fisica]       [2 - Pessoa Juridica]
                        tipoPessoa = getTipoPessoa();
                        switch (tipoPessoa) {
                            case 0:
                                System.out.println("Cancelando abertura de conta...");
                                break menuAberturaConta;
                            case 1:
                                cadastrarContaPF();
                                break;
                            case 2:
                                cadastrarContaPJ();
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("### Login ##############################################################################");
                    System.out.println("Informe os dados a seguir");
                    System.out.println("CPF ou CNPJ:");
                    String login = leitor.nextLine();
                    System.out.println("Senha:");
                    String senha = leitor.nextLine();
                    for (Conta conta : listaConta) {
                        if (conta.getCNPJ() != null) {
                            if (conta.getCNPJ().equals(login) && conta.getSenha().equals(senha)) {
                                    menuConta(conta);
                            }
                        } else {
                            if (conta.getCPF().equals(login) && conta.getSenha().equals(senha)) {
                                    menuConta(conta);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("########################################################################################");
                    System.out.println("# Lista:");
                    for (Conta conta : listaConta) {
                        System.out.println("# " + conta);
                    }
                    break;
            }
        }
    }


    // SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA
    private static void cadastrarContaPJ() {
        System.out.println("### Pessoa Juridica ####################################################################");
        int tipoConta = 0;
        // tipoContaPJ    -->      [1 - conta Corrente]        [2 - conta Investimento]
        tipoConta = escolherTipoContaPJ();
        if (tipoConta != 0) {
            cadastrarContaPJ(tipoConta);
        }
    }
    // SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA
    private static void cadastrarContaPJ(int tipoConta) {
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
    // SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA
    private static void cadastrarContaPF() {
        System.out.println("### Pessoa Fisica ######################################################################");
        int tipoConta = 0;
        // tipoConta    -->     [1 - conta Poupança]    [2 - conta Corrente]    [3 - conta Investimento]
        tipoConta = escolherTipoContaPF();
        if (tipoConta != 0) {
            cadastrarContaPF(tipoConta);
        }
    }
    // SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA SOBRECARGA
    private static void cadastrarContaPF(int tipoConta) {
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

    private static int escolherTipoContaPF() {
        int tipoConta = 0;
        while (true) {
            System.out.println("Informe o tipo de conta:");
            System.out.println("[0] - Cancelar");
            System.out.println("[1] - Conta Poupança");
            System.out.println("[2] - Conta Corrente");
            System.out.println("[3] - Conta Investimento");
            tipoConta = Integer.parseInt(leitor.nextLine());
            switch (tipoConta) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return tipoConta;
                default:
                    System.out.println(tipoConta + " não é uma escolha valida!");
                    System.out.println("########################################################################################");
                    break;
            }

        }
    }

    private static int escolherTipoContaPJ() {
        int tipoConta;
        while (true) {
            System.out.println("Informe o tipo de conta:");
            System.out.println("[0] - Cancelar");
            System.out.println("[1] - Conta Corrente");
            System.out.println("[2] - Conta Investimento");
            tipoConta = Integer.parseInt(leitor.nextLine());
            switch (tipoConta) {
                case 0:
                case 1:
                case 2:
                    return tipoConta;
                default:
                    System.out.println(tipoConta + " não é uma escolha valida!");
                    System.out.println("########################################################################################");
                    break;
            }
        }
    }

    private static int getTipoPessoa() {
        int tipoPessoa;
        System.out.println("### ABRINDO CONTA ######################################################################");
        System.out.println("Informe o tipo de conta que deseja abrir:");
        System.out.println("[0] - Sair");
        System.out.println("[1] - Pessoa Fisica");
        System.out.println("[2] - Pessoa Juridica ");
        tipoPessoa = Integer.parseInt(leitor.nextLine());
        return tipoPessoa;
    }

    private static int capturaOpcaoMenu() {
        // TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH TRY-CATCH
        try {
            System.out.println("###-MENU-PRINCIPAL-#####################################################################");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Abrir conta ");
            System.out.println("[2] - Logar ");
            System.out.println("[3] - Mostrar Lista de Conta ");
            return Integer.parseInt(leitor.nextLine());
        } catch (NumberFormatException excecao) {
            System.out.println("########################################################################################");
            System.out.println("Ocorreu uma exceção: " + excecao.getMessage());
            System.out.println("Tipo de exceção: " + excecao.getClass().getName());
            System.out.println("Favor informar apenas numero!");
            return 9;
        } catch (Exception excecao) {
            System.out.println("########################################################################################");
            System.out.println("Exceção de formatação no MENU PRINCIPAL ");
            System.out.println("Ocorreu uma exceção: " + excecao.getMessage());
            System.out.println("Tipo de exceção: " + excecao.getClass().getName());
            excecao.printStackTrace();
            return 9;
        }
    }

    private static void menuConta(Conta conta) {
        int op = 0;
        menuDaConta : while (true) {
            double valor = 0;
            System.out.println("###-MENU-DA-"+ conta.getClass().getSimpleName().toUpperCase() + "-DO(A)-" + conta.getNome().toUpperCase()+"-###############################################################################");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Sacar ");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Transferencia");
            System.out.println("[4] - Consultar saldo");
            op = Integer.parseInt(leitor.nextLine());
            switch (op) {
                case 0:
                    break menuDaConta;
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
                    if (contaBuscado != null) {
                        conta.transferencia(contaBuscado, valor);
                    } else {
                        System.out.println("Conta de destino não encontrada!");
                    }
                    break;
                case 4:
                    conta.consultarSaldo();
                    break;
            }
        }
    }

    private static Conta BuscarConta(String contaBuscada) {
        for (Conta conta : listaConta) {
            if (conta.getMatricula().equals(contaBuscada)) {
                return conta;
            }
        }
        return null;
    }

    private static void popularListaConta() {
        Conta conta1 = new ContaPoupanca("nome1", 21, "11111111111", "11111", 0, "111");
        Conta conta2 = new ContaPoupanca("nome2", 22, "22222222222", "22222", 0, "222");
        Conta conta3 = new ContaPoupanca("nome3", 23, "33333333333", "33333", 0, "333");
        Conta conta4 = new ContaCorrente("nome4", 24, null, "44444444444", "44444", 0, "444");
        Conta conta5 = new ContaCorrente("nome5", 25, null, "55555555555", "55555", 0, "555");
        Conta conta6 = new ContaCorrente("nome6", 0, "6666666666666", null, "66666", 0, "666");
        Conta conta7 = new ContaCorrente("nome7", 0, "7777777777777", null, "77777", 0, "777");
        Conta conta8 = new ContaInvestimento("nome8", 28, null, "88888888888", "88888", 0, "888");
        Conta conta9 = new ContaInvestimento("nome9", 0, "9999999999999", null, "99999", 0, "999");
        listaConta.add(conta1);
        listaConta.add(conta2);
        listaConta.add(conta3);
        listaConta.add(conta4);
        listaConta.add(conta5);
        listaConta.add(conta6);
        listaConta.add(conta7);
        listaConta.add(conta8);
        listaConta.add(conta9);
    }
}
