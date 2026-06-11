package model;

import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;

public class FilmeRepositorio {

    private static Database database;
    
    // Dao<ClasseDaEntidade, TipoDaChavePrimaria>
    private static Dao<Filme, Integer> dao;

    private List<Filme> loadedFilmes;
    private Filme loadedFilme;

    public FilmeRepositorio(Database database) {
        FilmeRepositorio.setDatabase(database);
        loadedFilmes = new ArrayList<Filme>();
    }

    public static void setDatabase(Database database) {
        FilmeRepositorio.database = database;

        try {
            dao = DaoManager.createDao(
                    database.getConnection(),
                    Filme.class);

            TableUtils.createTableIfNotExists(
                    database.getConnection(),
                    Filme.class);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Filme create(Filme filme) {

        int nrows = 0;

        try {

            nrows = dao.create(filme);

            if (nrows == 0)
                throw new SQLException("Error: object not saved");

            this.loadedFilme = filme;
            loadedFilmes.add(filme);

        } catch (SQLException e) {
            System.out.println(e);
        }

        return filme;
    }

    public void update(Filme filme) {

        try {

            int nrows = dao.update(filme);

            if (nrows == 0)
                throw new SQLException("Error: object not updated");

            this.loadedFilme = filme;

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(Filme filme) {

        try {

            int nrows = dao.delete(filme);

            if (nrows == 0)
                throw new SQLException("Error: object not deleted");

            loadedFilmes.remove(filme);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Filme loadFromId(int id) {

        try {

            this.loadedFilme = dao.queryForId(id);

            if (this.loadedFilme != null)
                this.loadedFilmes.add(this.loadedFilme);

        } catch (SQLException e) {
            System.out.println(e);
        }

        return this.loadedFilme;
    }

    public List<Filme> loadAll() {

        try {

            this.loadedFilmes = dao.queryForAll();

            if (this.loadedFilmes.size() != 0)
                this.loadedFilme = this.loadedFilmes.get(0);

        } catch (SQLException e) {
            System.out.println(e);
        }

        return this.loadedFilmes;
    }
}