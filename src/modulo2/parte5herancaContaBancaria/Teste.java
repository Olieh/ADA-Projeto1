package modulo2.parte5herancaContaBancaria;

public class Teste {
    public static void main(String[] args) {
        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setNomeCliente("Joao");
        cp1.setNumConta(1111);
        System.out.println("Nome: "+cp1.getNomeCliente());
        System.out.println("Nº conta: "+cp1.getNumConta());

        cp1.depositar(1000);
        cp1.exibirSaldo();

        cp1.depositar(500);
        cp1.exibirSaldo();

        cp1.sacar(3000);
        cp1.exibirSaldo();

        cp1.sacar(1400);
        cp1.exibirSaldo();

        System.out.println("====================================== TESTE COM CONTA CORRENTE ======================================");

        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNomeCliente("Pedro");
        cc1.setNumConta(2222);
        System.out.println("Nome: "+cc1.getNomeCliente());
        System.out.println("Nº conta: "+cc1.getNumConta());

        cc1.depositar(2000);
        cc1.exibirSaldo();

        cc1.depositar(700);
        cc1.exibirSaldo();

        cc1.sacar(4000);
        cc1.exibirSaldo();

        cc1.sacar(1700);
        cc1.exibirSaldo();
    }
}
