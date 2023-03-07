package Modulo2.parte2;

import java.util.Scanner;

public class Calculadora {
    public double numero1;
    public double numero2;
    public double resultado;
    public void somar() {
        resultado = (numero1 + numero2);
    }
    public void substrair() {
        resultado = (numero1 - numero2);
    }
    public void multiplicar() {
        resultado = (numero1 * numero2);
    }
    public void dividir() {
        resultado = (numero1 / numero2);
    }
    public void entradaDeDados() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        numero1 = Double.parseDouble(leitor.nextLine());
        System.out.println("Informe o segundo numero");
        numero2 = Double.parseDouble(leitor.nextLine());
    }
    public double saídaDeDados() {
        return resultado;
    }
}
