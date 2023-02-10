import java.util.Calendar;

public class CapturarAnoAtualCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int diaDoMes = cal.get(Calendar.DAY_OF_MONTH);
        int semanaCorrido = cal.get(Calendar.DAY_OF_WEEK);
        int diaCorrido = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("Data Completa: " + cal.getTime());
        System.out.println("Dia: " + day);
        System.out.println("Mes: " + month);
        System.out.println("Ano: " + year);
        System.out.println("Dia do mes: " + diaDoMes);
        System.out.println("Quantidade de semanas corrido deste ano: " + semanaCorrido);
        System.out.println("Quantidade de dias corrido deste ano: " + diaCorrido);
    }
}
