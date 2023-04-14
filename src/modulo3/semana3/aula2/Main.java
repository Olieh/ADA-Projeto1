package br.com.ada.first973.aulas.revisaoPOO;

public class Main {

    public static void main(String[] args) {

        System.out.println(TipoCarro.PASSEIO.name());
        System.out.println(TipoCarro.PASSEIO.ordinal());
        System.out.println(TipoCarro.MOTO.getCodigo());

        Carro carro1 = new Carro();
        carro1.setModelo("Gol");
        carro1.setMarca("Volks");
        carro1.setTipoCarro(TipoCarro.PASSEIO);
        System.out.println(carro1);

        Carro carro2 = new Carro();
        carro2.setModelo("Uno");
        carro2.setMarca("Fiat");
        carro2.setTipoCarro(TipoCarro.PASSEIO);
        System.out.println(carro2);

        if (TipoCarro.PASSEIO.equals(carro1.getTipoCarro())) {
            //faço alguma coisa
        }

        carro1.setModelo("Polo");
        System.out.println(carro1);

        System.out.println("carro1 = " + carro1);
        System.out.println("carro2 = " + carro2);

        Main mainObjeto = new Main();
        mainObjeto.imprimir("teste");
    }

     void imprimir(String mensagem) {
        System.out.println(mensagem);
    }

}