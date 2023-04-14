package modulo3.semana3.aula2.formatarTexto;

import modulo3.semana3.aula4.formatarTexto.FormatarMensagem;

public class FormatarMensagemMinuscula implements FormatarMensagem {

    @Override
    public String formatarMensagem(String mensagem) {
        String retorno = mensagem.toLowerCase();
        return retorno;
    }

}
