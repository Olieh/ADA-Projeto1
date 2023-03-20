package modulo2.trabalho;

public class ContaInvestimento extends Conta {
    // ATRIBUTOS #######################################################################################################

    // CONSTRUTORES ####################################################################################################
    public ContaInvestimento() {
    }

    public ContaInvestimento(String nome, int idade, String CNPJ, String CPF, String matricula, double saldo, String senha) {
        super(nome, idade, CNPJ, CPF, matricula, saldo, senha);
    }

    // GETTERS & SETTERS ###############################################################################################

    // TO STRING #######################################################################################################
    @Override
    public String toString() {
        return "ContaInvestimento{} " + super.toString();
    }

    // METODOS #########################################################################################################
    @Override
    public void depositar(double valor) {
        if (this.getCNPJ() != null) {
            System.out.println("Depositando..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
            setSaldo(getSaldo() + (valor + (valor * 0.04)));
            System.out.println("O deposito de " + valor + " do " + getNome() + " foi efetuado com sucesso! Obs: " + (valor + (valor * 0.04)) + " a mais por conta do investimento de 4%");
            System.out.println("__________________________________________________________________________");
        } else {
            System.out.println("Depositando..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
            setSaldo(getSaldo() + (valor + (valor * 0.02)));
            System.out.println("O deposito de " + valor + " do " + getNome() + " foi efetuado com sucesso! Obs: " +( valor + (valor * 0.02)) + " a mais por conta do investimento de 2%");
            System.out.println("__________________________________________________________________________");
        }
    }

}
