package modulo3.semana3.aula4;

import br.com.ada.first973.aulas.revisaoPOO.collections.Carro;

public class Main {

    public static void main(String[] args) {



        Carro carro1 = new Carro();
        carro1.setModelo("Gol");
        carro1.setMarca("Volks");
        System.out.println(carro1);

        Carro carro2 = new Carro();
        carro2.setModelo("Uno");
        carro2.setMarca("Fiat");
        System.out.println(carro2);


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