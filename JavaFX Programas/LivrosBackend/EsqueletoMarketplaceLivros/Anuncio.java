public class Anuncio {
    private Livro livro;
    private Usuario vendedor;
    private double preco;
    private String descricao;

    public Anuncio(Livro livro, Usuario vendedor, double preco, String descricao) {
        this.livro = livro;
        this.vendedor = vendedor;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Livro getLivro() { return livro; }
    public Usuario getVendedor() { return vendedor; }
    public double getPreco() { return preco; }
    public String getDescricao() { return descricao; }
    
    public void setLivro(Livro novoLivro) { livro = novoLivro; }
    public void setVendedor(Usuario novoVendedor) { vendedor = novoVendedor; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String info() {
        return "Livro: " + livro.info() +
               "\nVendedor: " + vendedor.info() +
               "\nPreço: R$ " + preco +
               "\nDescrição: " + descricao;
    }
}