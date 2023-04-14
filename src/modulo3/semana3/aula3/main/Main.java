package modulo3.semana3.aula3.main;

import modulo3.semana3.aula3.entity.ContaCorrente;
import modulo3.semana3.aula3.entity.ContaPoupanca;
import modulo3.semana3.aula3.entity.PessoaFisica;
import modulo3.semana3.aula3.entity.PessoaJuridica;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setCliente(pessoaFisica);
        contaCorrente.setCliente(pessoaJuridica);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setCliente(pessoaFisica);
        //contaPoupanca.setCliente(pessoaJuridica);

    }
}