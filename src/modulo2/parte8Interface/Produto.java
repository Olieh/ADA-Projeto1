package modulo2.parte8Interface;
public class Produto implements Comparable{
    private String nomeProd;
    private String marcaProd;
    private double precoProd;
    public Produto(){
    }
    public Produto(String nomeProd, String marcaProd, double precoProd) {
        this.nomeProd = nomeProd;
        this.marcaProd = marcaProd;
        this.precoProd = precoProd;
    }
    public String getNomeProd() {
        return nomeProd;
    }
    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }
    public String getMarcaProd() {
        return marcaProd;
    }
    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }
    public double getPrecoProd() {
        return precoProd;
    }
    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }
    @Override
    public String toString() {
        return "Produto {" +
                "nomeProd= '" + nomeProd + '\'' +
                ", marcaProd= '" + marcaProd + '\'' +
                ", precoProd= " + precoProd +
                '}';
    }
    // metodo compareTo é invocado pelo metodo Collections.sort
    @Override // TIP: toda classe começa com letra maiúscula
    public int compareTo(Object objeto) {
        Produto p = (Produto) objeto;
        // esse metodo compareTo recebe uma String como parametro e execulta o compareTo da classe String
        int comparar = this.nomeProd.compareTo(p.nomeProd);
        if (comparar < 0){
            return -1;
        }
        if (comparar > 0){
            return 1;
        }
        return 0;
    }

}