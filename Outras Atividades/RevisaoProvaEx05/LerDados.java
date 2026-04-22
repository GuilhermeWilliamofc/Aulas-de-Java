public class LerDados
{
    private String nome;
    private int idade;
    
    public LerDados(String nomeDigitado, int idadeDigitada){
        this.nome = nomeDigitado;
        this.idade = idadeDigitada;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void printDados(){
        System.out.printf("Dados do Usuario:\n");
        System.out.printf("Nome: %s \n", this.nome);
        System.out.printf("Idade: %d \n", this.idade);
    }
}