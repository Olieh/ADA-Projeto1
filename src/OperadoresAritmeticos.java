public class OperadoresAritmeticos {

    public static void main(String[] args) {

//         TIPO INTEIRO
//         byte(1 byte):-128 a 127
//         short(2 bytes):-32.768 a 32.767
//         long(8 bytes):-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
//         int(4 bytes):-2.147.483.648 a 2.147.483.647

//         TIPO PONTO FLUTUANTE
//         float (4 bytes): aprox. +- 3.40282347E+38F (6-7 dígitos decimais significativos)
//         double (8 bytes): aprox. +- 1.797691313486231570E+308 (15 dígitos decimais significativos)

//        Não usar double e float para representar valores exatos como moedas
//        Forma correta de usar BigDecimal:
//        BigDecimal valor1 = new BigDecimal("2.50");
//        BigDecimal valor2 = BigDecimal.valueOf(0.25);

//        https://sites.google.com/view/javacommiza/home/capitulo-01/declarando-e-inicializando-vari%C3%A1veis
//        declaração (Quando você declara uma variável, você precisa declarar o tipo da variável junto com um nome):
        double numero1;
        double numero2;

//        inicialização (dar um valor a ela):
        numero1 = 10;
        numero2 = 3;

//        varias operações com as varivaveis;
        System.out.println("Numero1 = " + numero1);
        System.out.println("Numero2 = " + numero2);
        System.out.println("-Numero1 = " + (-numero1));
        System.out.println("Numero1/numero2 =" + (numero1 / numero2));
        System.out.println("Resto de numero1 dividido por numero2 = "+ (numero1 % numero2));
        System.out.println("Numero Inteiro de: numero1 dividido por numero2 = "+ (int) (numero1 / numero2));
        System.out.println("Numero1 + 1 = "+ (1 + numero1));

//        Declarar e inicializar
//        double numero3 = 20;
//        teste

    }
}
