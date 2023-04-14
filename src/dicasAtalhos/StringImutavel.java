package dicasAtalhos;

public class StringImutavel {
    public static void main(String[] args) {

        String nome = "Mario";
        System.out.println(nome);
        nome  = nome.replace("M", "W");
        System.out.println(nome);
        nome = nome.toLowerCase();
        System.out.println(nome);
        char letra = nome.charAt(2);
        System.out.println(letra);
        int pos = nome.indexOf("io");
        System.out.println(pos);
        System.out.println(nome);
        nome += " Detona tudo";
        System.out.println(nome);
        String sub = nome.substring(6,12);
        System.out.println(sub);
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        //        isEmpty
        //        trim
        //        contains
        //        split
    }
}
