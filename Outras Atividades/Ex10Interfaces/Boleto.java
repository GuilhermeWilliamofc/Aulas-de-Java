public class Boleto implements MetodoPagamento
{
    @Override
    public void pagar(double valor){
        System.out.printf("Pagamento de R$%.2f iniciado via Boleto.\nLinha digitável gerada. Vencimento para 3 dias úteis.\n", valor);
    }
}