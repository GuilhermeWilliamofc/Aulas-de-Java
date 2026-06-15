package model;

public class ClienteRepositorio extends Repositorio<Cliente, Integer> {

    public ClienteRepositorio(Database database) {
        super(database, Cliente.class);
    }
}
