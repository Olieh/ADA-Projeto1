package br.com.ada.first973.aulas.revisaoPOO.abstracao;

import java.util.Scanner;

public class MainVeiculo {

    public static void main(String[] args) {

        VeiculoInterface veiculo = escolherVeiculo();

        acelerar(veiculo);

    }

    static VeiculoInterface escolherVeiculo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um tipo de carro:");
        String tipoCarro = scanner.nextLine();

        VeiculoInterface veiculo = null;

        if ("CE".equals(tipoCarro)) {
            veiculo = new CarroEsportivo();
        } else if ("CP".equals(tipoCarro)) {
            veiculo = new CarroPasseio();
        } else if ("M".equals(tipoCarro)) {
            veiculo = new Moto();
        } else if ("O".equals(tipoCarro)) {
            veiculo = new Onibus();
        }

        return veiculo;
    }

    static void acelerar(VeiculoInterface veiculo) {
        veiculo.acelerar();
        veiculo.acelerar();
        System.out.println(veiculo);
    }

}
