import java.io.DataInputStream;
import java.io.IOException;

public class EntradaComDataInputStream {
    public static void main(String[] args) {
        // recebe o comprimento e a largura de um retângulo em tempo de execução e apresenta o valor da área e do perímetro. A entrada dos dados do usuário é realizada por meio da classe
        //DataInputStream
        String s;
        float largura, comprimento, area, perimetro;
        DataInputStream dado;
        try{
            System.out.println("Entre com o comprimento");
            dado = new DataInputStream(System.in);
            s = dado.readLine(); // deprecated
            comprimento = Float.parseFloat(s);

            System.out.println("ENtre com a largura");
            dado = new DataInputStream(System.in);
            s = dado.readLine(); // deprecated
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = (comprimento * 2) + (largura * 2);
            System.out.println("Àrea do retãngulo : "+area);
            System.out.println("Perímetro do retãngulo : "+perimetro);
        } catch (IOException erro){
            System.out.println("Houve um erro na entrada de dados"+ erro.toString());
        }catch (NumberFormatException erro){
            System.out.println("Houve um erro na conversão, digite apenas caracteres numéricos"+erro.toString());
        }
    }
}