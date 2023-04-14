package br.com.ada.first973.aulas.revisaoPOO;

import java.util.Objects;

public class Carro {

    /*public enum TipoCarro {
        PASSEIO,
        MOTO,
        CAMINHAO
    }*/

    private String marca;
    private String modelo;
    private TipoCarro tipoCarro;
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

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCarro=" + tipoCarro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && tipoCarro == carro.tipoCarro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, tipoCarro);
    }

}
