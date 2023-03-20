package modulo2.trabalho;

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
        System.out.println("Depositando..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
        setSaldo(getSaldo()+(valor + (valor * 0.01)));
        System.out.println("O deposito de " + valor + " do " + getNome() + " foi efetuado com sucesso! Obs: "+(valor + (valor * 0.01))+" a mais por conta do investimento de 1%");
        System.out.println("__________________________________________________________________________");
    }

    //SACAR (PJ --> SAQUE TEM TAXA DE 0.5%)
    @Override
    public void sacar(double valor) {
        System.out.println("Sacando..."+getClass().getSimpleName().toUpperCase()+ " DO "+this.getNome().toUpperCase());
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("O saque do " + getNome() + " de " + valor + " foi realizado com sucesso!");
            System.out.println("__________________________________________________________________________");
        } else {
            System.out.println("Valor (" + valor + ") que deseja sacar não esta disponivel em sua conta!");
            System.out.println("__________________________________________________________________________");
        }
    }

    @Override
    public void transferencia(Conta contaDestino, double valor) {
        System.out.println("METODO SOBREESCRITO SEM A TAXA DE 0.5%, NÃO TEM A NECESSIDADE DE VERIFICAR SE É PJ OU PF, POIS POUPANÇA NAO POSSUI PJ");
        System.out.println("Realizando transferencia..."+getClass().getSimpleName().toUpperCase()+ " DO "+this.getNome().toUpperCase());
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            contaDestino.depositar(valor);
            System.out.println("Sua transferencia de " + valor + " de " + getNome() + " para " + contaDestino.getNome() + " foi realizada com sucesso!");
            System.out.println("__________________________________________________________________________");
        } else {
            System.out.println("Valor que deseja sacar não esta disponivel em sua conta!");
            System.out.println("__________________________________________________________________________");
        }

    }

}
