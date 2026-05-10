public class ImovelVelho extends Imovel
{
    private double precoDesconto;
    
    public ImovelVelho(String endereco, double precoBase, double precoDesconto){
        super(endereco, precoBase);
        this.precoDesconto = precoDesconto;
    }
    
    public double getPrecoDesconto(){
        return precoDesconto;
    }
    
    @Override
    public void exibirDados(){
        double calculoPreco = this.precoBase - this.precoDesconto; 
        
        System.out.println("Exibindo dados do imovel antigo:");
        System.out.printf("Endereco: %s\n", this.endereco);
        System.out.printf("Preco Final: R$ %.2f\n", calculoPreco);
    }
}