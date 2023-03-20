package trabalho;

public class ContaCorrente extends Conta {

    // ATRIBUTOS #######################################################################################################

    // CONSTRUTORES ####################################################################################################
    public ContaCorrente() {
    }
    public ContaCorrente(String nome, int idade, String CNPJ, String CPF, String matricula, double saldo, String senha) {
        super(nome, idade, CNPJ, CPF, matricula, saldo, senha);
    }

    // GETTERS & SETTERS ###############################################################################################

    // TO STRING #######################################################################################################
    @Override
    public String toString() {
        return "ContaCorrente{} " + super.toString();
    }

    // METODOS #########################################################################################################
}
