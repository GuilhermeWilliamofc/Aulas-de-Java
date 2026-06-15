package model;

public class FilmeRepositorio extends Repositorio<Filme, Integer> {

    public FilmeRepositorio(Database database) {
        super(database, Filme.class);
    }
}
