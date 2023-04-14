package modulo3.semana3.aula4.formatarTexto;

public class FormatarMensagemMinuscula implements FormatarMensagem{

    @Override
    public String formatarMensagem(String mensagem) {
        String retorno = mensagem.toLowerCase();
        return retorno;
    }

}
