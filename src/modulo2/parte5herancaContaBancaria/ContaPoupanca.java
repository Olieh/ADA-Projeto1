package modulo2.parte5herancaContaBancaria;

public class ContaPoupanca extends Conta{

    private double saldoPP;

    public double getSaldoPP() {
        return saldoPP;
    }

    public void setSaldoPP(double saldoPP) {
        this.saldoPP = saldoPP;
    }

    @Override
    public double depositar(double valor) {
        this.saldoPP += valor;
        return this.saldoPP;
    }

    @Override
    public double sacar(double valor) {
        if (saldoPP >= valor) {
            this.saldoPP -= valor;
            return this.saldoPP;
        }else{
            System.out.println("Não pode sacar um valor que não possui no deposito");
            return -1;
        }
    }

    @Override
    public void exibirSaldo() {
        System.out.println("SALDO ATUAL = "+saldoPP);
    }
}
