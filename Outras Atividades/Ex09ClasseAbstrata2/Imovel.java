public abstract class Imovel
{
    protected String endereco;
    protected double precoBase;
    
    public Imovel(String endereco, double precoBase){
        this.endereco = endereco;
        this.precoBase = precoBase;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public double getPrecoBase(){
        return precoBase;
    }
    
    public abstract void exibirDados();
}