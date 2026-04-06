public class Produto{
    private String nome;
    private double preco;

    public double getPreco(){
        return preco;
    }

    public void setPreco(double valor){
        if (valor > 0){
            this.preco = valor;
            System.out.println("Valor do produto alterado!");
        }
        else{
            System.out.println("Erro! Valor negativo");
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novonome){
        this.nome = novonome;
    }
}