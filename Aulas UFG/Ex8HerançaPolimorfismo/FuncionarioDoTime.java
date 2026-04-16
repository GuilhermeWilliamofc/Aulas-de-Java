public class FuncionarioDoTime
{
    protected String nome; // protected para as subclasses poderem utilizar os atributos
    protected double salario;
    protected static int quantidade_de_funcionarios;
    protected int idade;
    
    // Construtor, adiciona +1 funcionario no atributo
    FuncionarioDoTime(){
        quantidade_de_funcionarios += 1; 
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }
    
    public int getQuantFunc(){
        return quantidade_de_funcionarios;
    }
    
    public void treinarTime(){
        System.out.println("Avisando Tecnico para iniciar Treinamento...");
    }
    
    protected void tituloDados(){
        System.out.println("===== Dados do Funcionario do Time =====");
    }
    
    public void exibirDados(){
        tituloDados();
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: R$ " + getSalario());
        System.out.println("Quantidade de Funcionários: " + getQuantFunc());
    }
}
