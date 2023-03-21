package trabalho;

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
            System.out.println("########################################################################################");
            System.out.println("Depositando..." + getClass().getSimpleName().toUpperCase() + " DO(A) " + this.getNome().toUpperCase());
            setSaldo(getSaldo() + (valor + (valor * 0.04)));
            System.out.println("O deposito de " + valor + " do " + getNome() + " foi efetuado com sucesso!");
            System.out.println("Obs: O dono é PJ e recebe 4% nessa conta, o que equivale a " + (valor * 0.04));
        } else {
            System.out.println("########################################################################################");
            System.out.println("Depositando..." + getClass().getSimpleName().toUpperCase() + " DO(A) " + this.getNome().toUpperCase());
            setSaldo(getSaldo() + (valor + (valor * 0.02)));
            System.out.println("O deposito de " + valor + " do " + getNome() + " foi efetuado com sucesso! ");
            System.out.println("Obs: O dono é PF e recebe 2% nessa conta, o que equivale a " + (valor * 0.02));
        }
    }

}
