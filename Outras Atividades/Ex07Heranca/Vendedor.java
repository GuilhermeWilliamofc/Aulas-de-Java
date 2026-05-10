public class Vendedor extends Funcionario
{
    double comissao;
    
    public Vendedor(String nome, double salarioBase, double comissao){
        super(nome, salarioBase);
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario(){
        return salarioBase + comissao;
    }
}