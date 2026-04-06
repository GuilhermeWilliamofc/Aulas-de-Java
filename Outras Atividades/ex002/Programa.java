public class Programa {
    public static void main(String[] args){
        Produto produto1 = new Produto();
        produto1.setPreco(-50);
        double preco_produto1 = produto1.getPreco();
        System.out.println(preco_produto1);
    }
}
