package modulo3.semana3.aula2;

public class mensagemMaiusculo implements MensagemInterface {

    @Override
    public String aplicarMensagem(String msg) {
        return msg.toUpperCase();
    }
}
