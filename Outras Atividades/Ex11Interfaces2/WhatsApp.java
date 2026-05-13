public class WhatsApp implements Notificavel
{
    @Override
    public void enviarAviso(String mensagem){
        System.out.printf("[WhatsApp] Enviando:\n %s", mensagem);
    }
}