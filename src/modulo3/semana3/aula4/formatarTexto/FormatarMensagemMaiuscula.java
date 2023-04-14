package modulo3.semana3.aula4.formatarTexto;

public class FormatarMensagemMaiuscula implements FormatarMensagem{

    @Override
    public String formatarMensagem(String mensagem) {
        String retorno = mensagem.toUpperCase();
        return retorno;
    }

}
