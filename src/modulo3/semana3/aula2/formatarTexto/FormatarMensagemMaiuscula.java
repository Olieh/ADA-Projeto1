package br.com.ada.first973.aulas.revisaoPOO.formatarTexto;

public class FormatarMensagemMaiuscula implements FormatarMensagem{

    @Override
    public String formatarMensagem(String mensagem) {
        String retorno = mensagem.toUpperCase();
        return retorno;
    }

}
