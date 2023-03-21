package trabalho;

public class ContaPoupanca extends Conta {

    // ATRIBUTOS #######################################################################################################
    // CONSTRUTORES ####################################################################################################
    public ContaPoupanca() {
    }

    public ContaPoupanca(String nome, int idade, String CPF, String matricula, double saldo, String senha) {
        super(nome, idade, CPF, matricula, saldo, senha);
    }

    // GETTERS & SETTERS ###############################################################################################
    @Override
    public void setCNPJ(String CNPJ) {
        System.out.println("Não pode ser realizado o cadastro de CNPJ, apenas de CPF");
    }

    // TO STRING #######################################################################################################

    // METODOS #########################################################################################################
    @Override
    public void depositar(double valor) {
        System.out.println("########################################################################################");
        System.out.println("Depositando..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
        setSaldo(getSaldo() + (valor + (valor * 0.01)));
        System.out.println("O deposito de " + valor + " do " + getNome() + " foi efetuado com sucesso!");
        System.out.println("Obs: " + ((valor * 0.01)) + " a mais por conta do investimento de 1%");
    }

    //SACAR (NÃO TEMOS PJ NESSE TIPO DE CONTA, ENTAO ESTAMOS SOBREESCREVENDO PARA NAO TER ESSA VERIFICAÇÃO)
    @Override
    public void sacar(double valor) {
        System.out.println("Sacando..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
        if (valor <= this.getSaldo()) {
            System.out.println("########################################################################################");
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("O saque do " + getNome() + " de " + valor + " foi realizado com sucesso!");
        } else {
            System.out.println("########################################################################################");
            System.out.println("Valor (" + valor + ") que deseja sacar não esta disponivel em sua conta!");
        }
    }

    //TRANSFERENCIA (NÃO TEMOS PJ NESSE TIPO DE CONTA, ENTAO ESTAMOS SOBREESCREVENDO PARA NAO TER ESSA VERIFICAÇÃO)
    @Override
    public void transferencia(Conta contaDestino, double valor) {
        System.out.println("########################################################################################");
        System.out.println("Realizando transferencia..." + getClass().getSimpleName().toUpperCase() + " DO(A) " + this.getNome().toUpperCase());
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            contaDestino.depositar(valor);
            System.out.println("########################################################################################");
            System.out.println("Sua transferencia de " + valor + " de " + getNome() + " para " + contaDestino.getNome() + " foi realizada com sucesso!");
        } else {
            System.out.println("Valor que deseja sacar não esta disponivel em sua conta!");
        }

    }

}
