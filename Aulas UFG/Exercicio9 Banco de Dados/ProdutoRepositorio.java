import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class ProdutoRepositorio {

    private static Database database;

    // DAO que manipula Produto usando Integer como ID
    private static Dao<Produto, Integer> dao;

    // Cache local
    private List<Produto> loadedProdutos;
    private Produto loadedProduto;

    public ProdutoRepositorio(Database database) {
        ProdutoRepositorio.setDatabase(database);

        loadedProdutos = new ArrayList<>();
    }

    public static void setDatabase(Database database) {
        ProdutoRepositorio.database = database;

        try {

            // Cria DAO da entidade Produto
            dao = DaoManager.createDao(
                    database.getConnection(),
                    Produto.class
            );

            // Cria tabela se não existir
            TableUtils.createTableIfNotExists(
                    database.getConnection(),
                    Produto.class
            );

            System.out.println("✓ Tabela 'produto' pronta");

        } catch (SQLException e) {

            System.err.println("✗ Erro ao configurar DAO: "
                    + e.getMessage());
        }
    }

    // CREATE - Salva produto
    public Produto create(Produto produto) {

        try {

            int rows = dao.create(produto);

            if (rows == 0) {
                throw new SQLException("Erro: produto não salvo");
            }

            loadedProduto = produto;
            loadedProdutos.add(produto);

            System.out.println("✓ Produto criado: "
                    + produto.getNomeProduto());

        } catch (SQLException e) {

            System.err.println("✗ Erro no create: "
                    + e.getMessage());
        }

        return produto;
    }

    // UPDATE - Atualiza produto
    public boolean update(Produto produto) {

        try {

            int rows = dao.update(produto);

            System.out.println("✓ Produto atualizado: "
                    + rows + " linha(s)");

            return rows > 0;

        } catch (SQLException e) {

            System.err.println("✗ Erro no update: "
                    + e.getMessage());

            return false;
        }
    }

    // DELETE - Remove produto
    public boolean delete(Produto produto) {

        try {

            int rows = dao.delete(produto);

            if (rows > 0) {

                loadedProdutos.remove(produto);

                System.out.println("✓ Produto removido");
            }

            return rows > 0;

        } catch (SQLException e) {

            System.err.println("✗ Erro no delete: "
                    + e.getMessage());

            return false;
        }
    }

    // READ BY ID - Busca produto pelo ID
    public Produto loadFromId(int id) {

        try {

            loadedProduto = dao.queryForId(id);

            if (loadedProduto != null &&
                    !loadedProdutos.contains(loadedProduto)) {

                loadedProdutos.add(loadedProduto);
            }

            return loadedProduto;

        } catch (SQLException e) {

            System.err.println("✗ Erro ao buscar por ID: "
                    + e.getMessage());

            return null;
        }
    }

    // READ ALL - Busca todos os produtos
    public List<Produto> loadAll() {

        try {

            loadedProdutos = dao.queryForAll();

            if (!loadedProdutos.isEmpty()) {

                loadedProduto = loadedProdutos.get(0);
            }

            System.out.println("✓ "
                    + loadedProdutos.size()
                    + " produto(s) carregado(s)");

            return loadedProdutos;

        } catch (SQLException e) {

            System.err.println("✗ Erro ao carregar todos: "
                    + e.getMessage());

            return new ArrayList<>();
        }
    }

    // Busca personalizada por nome
    public List<Produto> findByNomeProduto(String nomeProduto) {

        try {

            return dao.queryBuilder()
                    .where()
                    .eq("nomeProduto", nomeProduto)
                    .query();

        } catch (SQLException e) {

            System.err.println("✗ Erro na busca: "
                    + e.getMessage());

            return new ArrayList<>();
        }
    }

    // Getters
    public Produto getLoadedProduto() {

        return loadedProduto;
    }

    public List<Produto> getLoadedProdutos() {

        return loadedProdutos;
    }
}