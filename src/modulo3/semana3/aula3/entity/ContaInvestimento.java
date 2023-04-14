package modulo3.semana3.aula3.entity;

public class ContaInvestimento extends Conta {

    private Pessoa cliente;

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
}
