package heranca;

//  O estagiário entra com as horas de estágio na semana, quantos
//  meses ele estagiou e calcula-se quantas horas ele estagiou

public class Estagiario extends Funcionario {
    private int HorasSemanaEstagiou;
    private int MesesEstagiou;
    private int horasEstagiou;

    public int getHorasSemanaEstagiou() {
        return HorasSemanaEstagiou;
    }

    public void setHorasSemanaEstagiou(int horasSemanaEstagiou) {
        this.HorasSemanaEstagiou = horasSemanaEstagiou;
    }

    public int getMesesEstagiou() {
        return MesesEstagiou;
    }

    public void setMesesEstagiou(int mesesEstagiou) {
        this.MesesEstagiou = mesesEstagiou;
    }

    public int getHorasEstagiou() {
        return horasEstagiou;
    }

    public void setHorasEstagiou(int horasEstagiou) {
        this.horasEstagiou = horasEstagiou;
    }

    @Override
    public String toString() {
        return "\nHorasSemanaEstagiou=" + HorasSemanaEstagiou +
                "\nMesesEstagiou=" + MesesEstagiou +
                "\nhorasEstagiou=" + horasEstagiou +
                super.toString();
    }
}
