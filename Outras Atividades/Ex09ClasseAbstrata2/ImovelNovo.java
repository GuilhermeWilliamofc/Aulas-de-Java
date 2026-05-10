public class ImovelNovo extends Imovel
{
    private double precoAdicional;
    
    public ImovelNovo(String endereco, double precoBase, double precoAdicional){
        super(endereco, precoBase);
        this.precoAdicional = precoAdicional;
    }
    
    public double getPrecoAdicional(){
        return precoAdicional;
    }
    
    @Override
    public void exibirDados(){
        double calculoPreco = this.precoBase + this.precoAdicional;
        
        System.out.println("Exibindo dados do imovel novo:");
        System.out.printf("Endereco: %s\n", this.endereco);
        System.out.printf("Preco Final: R$ %.2f\n", calculoPreco);
    }
}