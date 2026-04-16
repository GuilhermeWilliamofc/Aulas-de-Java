
public class Jogador extends FuncionarioDoTime
{
    private int quantidade_de_gols;
    private int numeroCamisa;
    private String posicao;
    
    public int getQuantidade_de_gols(){
        return quantidade_de_gols;
    }
    
    public void setQuantidade_de_gols(int novaQuantidade_de_gols){
        this.quantidade_de_gols = novaQuantidade_de_gols;
    }
    
    public int getNumeroCamisa(){
        return numeroCamisa;
    }
    
    public void setNumeroCamisa(int novoNumeroCamisa){
        this.numeroCamisa = novoNumeroCamisa;
    }
    
    public String getPosicao(){
        return posicao;
    }
    
    public void setPosicao(String novaPosicao){
        this.posicao = novaPosicao;
    }
        
    @Override
    protected void tituloDados(){
        System.out.println("===== Dados do Jogador =====");
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados(); // dados da superclasse
        
        // Dados do Jogador
        System.out.println("Número da camisa: " + getNumeroCamisa());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Quantidade de gols: " + getQuantidade_de_gols());
    }
}
