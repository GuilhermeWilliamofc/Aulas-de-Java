package model;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class Repositorio<T, ID> {

    protected Database database;
    protected Dao<T, ID> dao;
    protected List<T> loadedEntities;
    protected T loadedEntity;

    public Repositorio(Database database, Class<T> entityClass) {
        this.database = database;
        this.loadedEntities = new ArrayList<>();
        initializeDao(entityClass);
    }

    private void initializeDao(Class<T> entityClass) {
        try {
            dao = DaoManager.createDao(database.getConnection(), entityClass);
            TableUtils.createTableIfNotExists(database.getConnection(), entityClass);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public T create(T entity) {
        try {
            int nrows = dao.create(entity);

            if (nrows == 0) {
                throw new SQLException("Error: object not saved");
            }

            this.loadedEntity = entity;
            loadedEntities.add(entity);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return entity;
    }

    public void update(T entity) {
        try {
            int nrows = dao.update(entity);

            if (nrows == 0) {
                throw new SQLException("Error: object not updated");
            }

            this.loadedEntity = entity;
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(T entity) {
        try {
            int nrows = dao.delete(entity);

            if (nrows == 0) {
                throw new SQLException("Error: object not deleted");
            }

            loadedEntities.remove(entity);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public T loadFromId(ID id) {
        try {
            this.loadedEntity = dao.queryForId(id);

            if (this.loadedEntity != null) {
                this.loadedEntities.add(this.loadedEntity);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return this.loadedEntity;
    }

    public List<T> loadAll() {
        try {
            this.loadedEntities = dao.queryForAll();

            if (!this.loadedEntities.isEmpty()) {
                this.loadedEntity = this.loadedEntities.get(0);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return this.loadedEntities;
    }

    public T getLoadedEntity() {
        return loadedEntity;
    }

    public List<T> getLoadedEntities() {
        return loadedEntities;
    }
}
