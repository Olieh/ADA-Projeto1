package br.com.ada.first973.aulas.revisaoPOO.formatarTexto;

public class FormatarMensagemMinuscula implements FormatarMensagem{

    @Override
    public String formatarMensagem(String mensagem) {
        String retorno = mensagem.toLowerCase();
        return retorno;
    }

}
