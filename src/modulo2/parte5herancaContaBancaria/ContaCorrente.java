package modulo2.parte5herancaContaBancaria;

public class ContaCorrente extends Conta {

    private double saldoCC;

    public double getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }

    @Override
    public double depositar(double valor) {
        this.saldoCC += valor;
        return this.saldoCC;
    }

    @Override
    public double sacar(double valor) {
        if (saldoCC >= valor) {
            this.saldoCC -= valor;
            return this.saldoCC;
        }else{
            System.out.println("Não pode sacar um valor que não possui no deposito");
            return -1;
        }
    }

    @Override
    public void exibirSaldo() {
        System.out.println("SALDO ATUAL = " + saldoCC);
    }
}
