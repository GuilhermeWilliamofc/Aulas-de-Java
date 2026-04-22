public class Estudante
{
    private String nome;
    private int idade;
    private double media;
    private String situacaoEscolar;
    
    public Estudante(String nomeDigitado, int idadeDigitada, double mediaDigitada, String situacaoDigitada){
        this.nome = nomeDigitado;
        this.idade = idadeDigitada;
        this.media = mediaDigitada;
        this.situacaoEscolar = situacaoDigitada;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public double getMedia(){
        return media;
    }
    
    public String getSituacaoEscolar(){
        return situacaoEscolar;
    }
    
    public void printDados(){
        System.out.println("Dados do Aluno:");
        System.out.printf("Nome: %s \n", this.nome);
        System.out.printf("Idade: %d \n", this.idade);
        System.out.printf("Media: %.2f \n", this.media);
        System.out.printf("Situacao: %s \n", this.situacaoEscolar);
    }
}