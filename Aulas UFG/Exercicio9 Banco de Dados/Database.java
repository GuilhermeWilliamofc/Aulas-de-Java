import java.sql.SQLException;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

public class Database {
    private String databaseName;
    private JdbcConnectionSource connection;

    public Database(String databaseName) {
        this.databaseName = databaseName;
    }

    public JdbcConnectionSource getConnection() throws SQLException {
        if (databaseName == null) {
            throw new SQLException("Database name is null");
        }
        if (connection == null) {
            try {
                // String de conexão JDBC para SQLite
                connection = new JdbcConnectionSource("jdbc:sqlite:" + databaseName);
                System.out.println("Banco de dados aberto com sucesso");
            } catch (Exception e) {
                System.err.println("Erro: " + e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
        }
        return connection;
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("Conexão fechada");
            } catch (Exception e) {
                System.err.println("Erro ao fechar: " + e);
            }
        }
    }
}