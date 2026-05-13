public class Email implements Notificavel
{
    @Override
    public void enviarAviso(String mensagem){
        System.out.printf("[Email] Enviando:\n %s", mensagem);
    }
}