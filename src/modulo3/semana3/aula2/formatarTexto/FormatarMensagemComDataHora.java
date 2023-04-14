package modulo3.semana3.aula2.formatarTexto;

import modulo3.semana3.aula4.formatarTexto.FormatarMensagem;

import java.time.LocalDateTime;

public class FormatarMensagemComDataHora implements FormatarMensagem {

    @Override
    public String formatarMensagem(String mensagem) {
        return LocalDateTime.now() + " " + mensagem;
    }

}
