package modulo2.parte6;


public class Forma extends Geometria{

    private double ladoA;
    private double ladoB;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    //Criar um metodo para calcular a area de um cilindro
    // area = 3.14 * raio^2
    public double calcular(){
        return (3.14 *(this.raio * this.raio));
    }

    public double calcular(double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        double area = this.ladoA * this.ladoB;
        return  area;
    }

    public double calcular(double ladoA, float ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        double area = (this.ladoA * this.ladoB)/2;
        return  area;
    }

}
