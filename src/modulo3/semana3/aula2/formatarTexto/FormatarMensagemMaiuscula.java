package modulo3.semana3.aula2.formatarTexto;

import modulo3.semana3.aula4.formatarTexto.FormatarMensagem;

public class FormatarMensagemMaiuscula implements FormatarMensagem {

    @Override
    public String formatarMensagem(String mensagem) {
        String retorno = mensagem.toUpperCase();
        return retorno;
    }

}
