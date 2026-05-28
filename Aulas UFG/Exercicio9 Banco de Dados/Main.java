import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1 Inicializa banco de dados
        Database db = new Database("mercado.db");

        // 2 Cria repositório
        ProdutoRepositorio repo =
                new ProdutoRepositorio(db);

        // 3 Cria novos produtos
        Produto p1 =
                new Produto("Arroz", 25.90);

        Produto p2 =
                new Produto("Feijão", 9.50);

        Produto p3 =
                new Produto("Macarrão", 6.75);

        // 4 Salva produtos
        repo.create(p1);
        repo.create(p2);
        repo.create(p3);

        // 5 Lista todos os produtos
        System.out.println("\nLista de produtos:");

        for (Produto p : repo.loadAll()) {

            System.out.println(" → " + p);
        }

        // 6 Busca produto por ID
        System.out.println("\nBuscando produto ID 3:");

        Produto encontrado =
                repo.loadFromId(3);

        if (encontrado != null) {

            System.out.println(" ✓ " + encontrado);
        }

        // 7 Atualiza produto
        if (encontrado != null) {

            encontrado.setNomeProduto("Macarrão Instantâneo");

            encontrado.setPrecoProduto(8.99);

            repo.update(encontrado);
        }

        // 8 Lista novamente após update
        System.out.println("\nProdutos atualizados:");

        for (Produto p : repo.loadAll()) {

            System.out.println(" → " + p);
        }

        // 9 Fecha conexão
        db.close();
    }
}