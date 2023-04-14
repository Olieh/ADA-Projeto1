package br.com.ada.first973.aulas.revisaoPOO.collections;

public class Carro {

    /*public enum TipoCarro {
        PASSEIO,
        MOTO,
        CAMINHAO
    }*/

    private String marca;
    private String modelo;
    private Double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

}
