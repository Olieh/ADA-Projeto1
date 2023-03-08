package modulo2.parte3heranca;

public class Funcionario {
    private String nome;
    private int idade;
    private String bairro;
    private int horasDiariaTrabalhada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getHorasDiariaTrabalhada() {
        return horasDiariaTrabalhada;
    }

    public void setHorasDiariaTrabalhada(int horasDiariaTrabalhada) {
        this.horasDiariaTrabalhada = horasDiariaTrabalhada;
    }

    @Override
    public String toString() {
        return "\n nome='" + nome +
                "\n idade=" + idade +
                "\n bairro='" + bairro +
                "\n horasDiariaTrabalhada=" + horasDiariaTrabalhada;
    }
}
