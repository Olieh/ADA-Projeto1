package trabalho;

public class Conta extends Pessoa {
    // ATRIBUTOS #######################################################################################################
    private String matricula;
    private double saldo;
    private String senha;

    // CONSTRUTORES ####################################################################################################
    public Conta() {
    }

    public Conta(String nome, int idade, String CNPJ, String CPF, String matricula, double saldo, String senha) {
        super(nome, idade, CNPJ, CPF);
        this.matricula = matricula;
        this.saldo = saldo;
        this.senha = senha;
    }

    public Conta(String nome, int idade, String CPF, String matricula, double saldo, String senha) {
        super(nome, idade, CPF);
        this.matricula = matricula;
        this.saldo = saldo;
        this.senha = senha;
    }

    // GETTERS & SETTERS ###############################################################################################
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // TO STRING #######################################################################################################
    @Override
    public String toString() {
        return "Conta{" +
                "matricula='" + matricula + '\'' +
                ", saldo=" + saldo +
                ", senha='" + senha + '\'' +
                "} " + super.toString();
    }

    // METODOS #########################################################################################################
    //SACAR (PJ --> SAQUE TEM TAXA DE 0.5%)
    public void sacar(double valor) {
        System.out.println("Sacando..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
        if (this.getCNPJ() != null) {
            if ((valor * 0.005) <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - (valor * 0.005));
                System.out.println("foi cobrado " + (valor * 0.005) + " como taxa, por essa conta ser do tipo PJ!");
                System.out.println("O saque do " + getNome() + " de " + valor + " foi realizado com sucesso!");
                System.out.println("__________________________________________________________________________");
            } else {
                System.out.println("Valor (" + (valor * 0.005) + ") que deseja sacar não esta disponivel em sua conta! cobramos 0.5% de taxa");
                System.out.println("__________________________________________________________________________");
            }
        } else {
            if (valor <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("O saque do " + getNome() + " de " + valor + " foi realizado com sucesso!");
                System.out.println("__________________________________________________________________________");
            } else {
                System.out.println("Valor (" + valor + ") que deseja sacar não esta disponivel em sua conta!");
                System.out.println("__________________________________________________________________________");
            }
        }
    }

    //DEPOSITAR
    public void depositar(double valor) {
        System.out.println("Depositando..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
        this.saldo += valor;
        System.out.println("O deposito de " + valor + " do " + getNome() + " foi efetuado com sucesso!");
        System.out.println("__________________________________________________________________________");
    }

    //TRANSFERENCIA (PJ --> SAQUE E TRANSFERENCIA TEM TAXA DE 0.5%)
    public void transferencia(Conta contaDestino, double valor) {
        System.out.println("Realizando transferencia..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
        if (this.getCNPJ() != null) {
            System.out.println("PJ");
            if (valor + (valor * 0.005) <= this.getSaldo()) {
                saldo -= valor + (valor * 0.005);
                contaDestino.depositar(valor);
                System.out.println("foi cobrado " + (valor * 0.005) + " como taxa, por essa conta ser do tipo PJ!");
                System.out.println("O saque do " + getNome() + " de " + valor + " foi realizado com sucesso!");
                System.out.println("__________________________________________________________________________");
            } else {
                System.out.println("Valor (" + (valor * 0.005) + " + " + valor + ") que deseja sacar não esta disponivel em sua conta! cobramos 0.5% de taxa");
                System.out.println("__________________________________________________________________________");
            }
        } else {
            System.out.println("PF");
            if (valor <= saldo) {
                this.saldo -= valor;
                contaDestino.depositar(valor);
                System.out.println("Sua transferencia de " + valor + " de " + getNome() + " para " + contaDestino.getNome() + " foi realizada com sucesso!");
                System.out.println("__________________________________________________________________________");
            } else {
                System.out.println("Valor que deseja sacar não esta disponivel em sua conta!");
                System.out.println("__________________________________________________________________________");
            }
        }
    }

    //CONSULTAR SALDO
    public void consultarSaldo() {
        System.out.println("Realizando Consulta..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
        System.out.println("Saldo do " + this.getNome() + " é: R$" + saldo);
        System.out.println("__________________________________________________________________________");
    }
}
