package br.com.ada.first973.aulas.revisaoPOO.formatarTexto;

import java.time.LocalDateTime;

public class FormatarMensagemComDataHora implements FormatarMensagem{

    @Override
    public String formatarMensagem(String mensagem) {
        return LocalDateTime.now() + " " + mensagem;
    }

}
