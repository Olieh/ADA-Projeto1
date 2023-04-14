package modulo3.semana3.aula2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class mensagemComData implements MensagemInterface {

    @Override
    public String aplicarMensagem(String msg) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm - ");
        return LocalDateTime.now().format(formatter) + msg;
    }
}
