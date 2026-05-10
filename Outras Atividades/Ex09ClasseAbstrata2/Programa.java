public class Programa
{
    public static void exibirImovel(Imovel i){
        i.exibirDados();
    }
    
    public static void main(String[] args){
        Imovel novo = new ImovelNovo("Rua Fulano, Bairro Ciclano, Numero 15", 500250.50, 3500);
        Imovel velho = new ImovelVelho("Rua das Laranjeiras, Bairro Brasiliano, Numero 26", 250050.25, 5000);
        
        exibirImovel(novo);
        exibirImovel(velho);
    }
}