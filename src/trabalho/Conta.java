package trabalho;

import java.util.Comparator;

public class Conta extends Pessoa implements Comparable<Conta>{
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
        return "Conta{" + "matricula='" + matricula + '\'' + ", saldo=" + saldo + ", senha='" + senha + '\'' + "} " + super.toString();
    }

    // METODOS #########################################################################################################
    //SACAR (PJ --> SAQUE TEM TAXA DE 0.5%)
    public void sacar(double valor) {
        System.out.println("Sacando..." + getClass().getSimpleName().toUpperCase() + " DO " + this.getNome().toUpperCase());
        if (this.getCNPJ() != null) {
            if ((valor * 0.005) <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - (valor * 0.005));
                System.out.println("########################################################################################");
                System.out.println("foi cobrado " + (valor * 0.005) + " como taxa, por essa conta ser do tipo PJ!");
                System.out.println("O saque do " + getNome() + " de " + valor + " foi realizado com sucesso!");
            } else {
                System.out.println("########################################################################################");
                System.out.println("Valor (" + (valor * 0.005) + ") que deseja sacar não esta disponivel em sua conta! cobramos 0.5% de taxa");
            }
        } else {
            if (valor <= this.getSaldo()) {
                System.out.println("########################################################################################");
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("O saque do " + getNome() + " de " + valor + " foi realizado com sucesso!");
            } else {
                System.out.println("__________________________________________________________________________");
                System.out.println("Valor (" + valor + ") que deseja sacar não esta disponivel em sua conta!");
            }
        }
    }

    //DEPOSITAR
    public void depositar(double valor) {
        System.out.println("########################################################################################");
        System.out.println("Depositando..." + getClass().getSimpleName().toUpperCase() + " DO(A) " + this.getNome().toUpperCase());
        this.saldo += valor;
        System.out.println("O deposito de " + valor + " do " + getNome() + " foi efetuado com sucesso!");
    }

    //TRANSFERENCIA (PJ --> SAQUE E TRANSFERENCIA TEM TAXA DE 0.5%)
    public void transferencia(Conta contaDestino, double valor) {
        System.out.println("########################################################################################");
        System.out.println("Realizando transferencia..." + getClass().getSimpleName().toUpperCase() + " DO(A) " + this.getNome().toUpperCase());
        if (this.getCNPJ() != null) {
            if (valor + (valor * 0.005) <= this.getSaldo()) {
                saldo -= valor + (valor * 0.005);
                contaDestino.depositar(valor);
                System.out.println("########################################################################################");
                System.out.println("Sua transferencia de " + valor + " de " + getNome() + " para " + contaDestino.getNome() + " foi realizada com sucesso!");
                System.out.println("foi cobrado " + (valor * 0.005) + " como taxa, por essa conta ser do tipo PJ!");
            } else {
                System.out.println("Valor (" + (valor * 0.005) + " + " + valor + ") que deseja sacar não esta disponivel em sua conta! cobramos 0.5% de taxa");
            }
        } else {
            if (valor <= saldo) {
                this.saldo -= valor;
                contaDestino.depositar(valor);
                System.out.println("########################################################################################");
                System.out.println("Sua transferencia de " + valor + " de " + getNome() + " para " + contaDestino.getNome() + " foi realizada com sucesso!");
            } else {
                System.out.println("Valor que deseja sacar não esta disponivel em sua conta!");
            }
        }
    }

    //CONSULTAR SALDO
    public void consultarSaldo() {
        System.out.println("########################################################################################");
        System.out.println("Realizando Consulta..." + getClass().getSimpleName().toUpperCase() + " DO(A) " + this.getNome().toUpperCase());
        System.out.println("Saldo do " + this.getNome() + " é: R$" + saldo);
    }

    @Override
    public int compareTo(Conta conta) {
        return this.getNome().compareTo(conta.getNome());
    }

    // REVER ESSE CODIGO FUTURAMENTE!! SÓ FIZ ISSO PORQUE NAO ENCONTREI A MELHOR FORMA PARA TER 2 OU MAIS METODO PARA ORDENAR POR (IDADE) OU POR (NOME);
    // Declaramos um método chamado compararPorIdade, que é público e estático, ou seja, pode ser acessado sem criar uma
    // instância da classe e é compartilhado por todas as instâncias da classe. O método retorna um objeto do tipo Comparator<Pessoa>.
    public static Comparator<Conta> compararPorIdade() {
        // Estamos criando um objeto anônimo (sem nome) que implementa a interface Comparator<Conta>. Este objeto será
        // retornado pelo método compararPorIdade()
        return new Comparator<Conta>() {
            // Esta anotação indica que o método que vem a seguir é uma implementação de um método da interface Comparator
            @Override
            // Aqui, estamos definindo o método compare que será utilizado para comparar dois objetos da classe Pessoa,
            // conta1 e conta2. Este método retorna um valor inteiro, que pode ser negativo, zero ou positivo, dependendo do resultado da comparação.
            public int compare(Conta conta1, Conta conta2) {
                // Nesta linha, estamos usando o método Integer.compare(), que compara dois valores inteiros. No nosso caso,
                // estamos comparando as idades das duas pessoas
                return Integer.compare(conta1.getIdade(), conta2.getIdade());
            }
        };
    }
}
