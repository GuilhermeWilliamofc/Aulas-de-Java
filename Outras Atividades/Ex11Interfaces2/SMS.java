public class SMS implements Notificavel
{
    @Override
    public void enviarAviso(String mensagem){
        System.out.printf("[SMS] Enviando:\n %s", mensagem);
    }
}