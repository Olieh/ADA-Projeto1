package modulo2.trabalho;

public abstract class Pessoa {
    // ATRIBUTOS #######################################################################################################
    private String nome;
    private int idade;
    private String CNPJ;
    private String CPF;

    // CONSTRUTORES ####################################################################################################
    public Pessoa() {
    }
    //para usar apenas CPF
    public Pessoa(String nome, int idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }
    //para usar apenas CNPJ
    public Pessoa(String nome, int idade, String CNPJ, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
    }
    // GETTERS & SETTERS ###############################################################################################
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

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    // TO STRING #######################################################################################################
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", CNPJ='" + CNPJ + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
    // METODOS #########################################################################################################

}
