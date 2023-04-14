package modulo3.semana3.aula2;

public class mensagemMinusculo implements MensagemInterface {

    @Override
    public String aplicarMensagem(String msg) {
        return msg.toLowerCase();
    }
}
