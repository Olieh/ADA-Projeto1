package modulo3.semana3.aula4;

public enum TipoCarro {

    MOTO("01"),
    CAMINHAO("02"),
    PASSEIO("03");

    private String codigo;

    TipoCarro(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
