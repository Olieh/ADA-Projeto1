package modulo3.semana3.aula3.entity;

public class ContaPoupanca extends Conta {

    private PessoaFisica cliente;

    public PessoaFisica getCliente() {
        return cliente;
    }

    public void setCliente(PessoaFisica cliente) {
        this.cliente = cliente;
    }


}
