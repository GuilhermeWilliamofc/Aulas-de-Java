package model;

public class Repositorios {

    private final Database database;
    private FilmeRepositorio filmeRepositorio;
    private ClienteRepositorio clienteRepositorio;

    public Repositorios(Database database) {
        this.database = database;
    }

    public FilmeRepositorio getFilmeRepositorio() {
        if (filmeRepositorio == null) {
            filmeRepositorio = new FilmeRepositorio(database);
        }
        return filmeRepositorio;
    }

    public ClienteRepositorio getClienteRepositorio() {
        if (clienteRepositorio == null) {
            clienteRepositorio = new ClienteRepositorio(database);
        }
        return clienteRepositorio;
    }
}
