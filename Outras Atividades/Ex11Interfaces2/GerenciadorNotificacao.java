public class GerenciadorNotificacao
{
    public static void notificar(Notificavel n, String mensagem){
        n.enviarAviso(mensagem);
    }
    
    public static void quebrarLinha(){
        System.out.println("");
    }
    
    public static void main(String[] args){
        Notificavel email = new Email();
        Notificavel sms = new SMS();
        Notificavel zapzap = new WhatsApp();
        
        notificar(email, "Eae meu nobre");
        quebrarLinha();
        notificar(sms, "Oh maga");
        quebrarLinha();
        notificar(zapzap, "zapzap :D");
    }
}