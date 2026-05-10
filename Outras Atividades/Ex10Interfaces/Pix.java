public class Pix implements MetodoPagamento
{
    @Override
    public void pagar(double valor){
        System.out.printf("Pagamento de R$%.2f realizado via Pix. Gerando QR Code.\n", valor);
    }
}