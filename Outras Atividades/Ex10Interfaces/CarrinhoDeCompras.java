public class CarrinhoDeCompras
{
    public static void finalizarVenda(MetodoPagamento metodo, double total){
        metodo.pagar(total);
    }
    
    public static void main(String[] args){
        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento pix = new Pix();
        MetodoPagamento boleto = new Boleto();
        
        finalizarVenda(cartao, 2500);
        finalizarVenda(pix, 350);
        finalizarVenda(boleto, 7600);
    }
}