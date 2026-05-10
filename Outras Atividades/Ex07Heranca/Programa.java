public class Programa
{
    public static void imprimirRelatorio(Funcionario f){
        System.out.printf("Nome: %s\n", f.nome);
        System.out.printf("Salario Final: %.2f\n", f.calcularSalario());
    }
    
    public static void main(String[] args){
        Funcionario vendedor = new Vendedor("Cleitin", 2000, 700);
        Funcionario gerente = new Gerente("Geraldo", 5000);
        
        System.out.println("Imprimindo Dados do Vendedor");
        imprimirRelatorio(vendedor);
        System.out.println("\nImprimindo Dados do Gerente");
        imprimirRelatorio(gerente);
    }
}