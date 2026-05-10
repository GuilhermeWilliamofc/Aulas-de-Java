public class CartaoCredito implements MetodoPagamento
{
    @Override
    public void pagar(double valor){
        System.out.printf("Pagamento de R$%.2f realizado via Crédito. Parcelas calculadas.\n", valor);
    }
}