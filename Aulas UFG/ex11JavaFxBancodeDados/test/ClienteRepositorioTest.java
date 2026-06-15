package test;

import model.Cliente;
import model.ClienteRepositorio;
import model.Database;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

public class ClienteRepositorioTest {

    private Database database;
    private ClienteRepositorio repositorio;
    private String databaseName;

    @Before
    public void setUp() {
        databaseName = "test_cliente_" + System.nanoTime() + ".sqlite";
        database = new Database(databaseName);
        repositorio = new ClienteRepositorio(database);
    }

    @After
    public void tearDown() {
        database.close();
        new File(databaseName).delete();
    }

    @Test
    public void testCreate() {
        Cliente cliente = new Cliente();
        cliente.setNome("Maria Silva");
        cliente.setTelefone("62999998888");
        cliente.setEmail("maria@email.com");

        Cliente salvo = repositorio.create(cliente);

        assertNotNull(salvo);
        assertTrue(salvo.getId() > 0);
        assertEquals("Maria Silva", salvo.getNome());
        assertEquals("62999998888", salvo.getTelefone());
        assertEquals("maria@email.com", salvo.getEmail());
    }

    @Test
    public void testLoadFromId() {
        Cliente cliente = new Cliente();
        cliente.setNome("João Santos");
        cliente.setTelefone("62988887777");
        cliente.setEmail("joao@email.com");
        repositorio.create(cliente);

        Cliente carregado = repositorio.loadFromId(cliente.getId());

        assertNotNull(carregado);
        assertEquals(cliente.getId(), carregado.getId());
        assertEquals("João Santos", carregado.getNome());
        assertEquals("62988887777", carregado.getTelefone());
        assertEquals("joao@email.com", carregado.getEmail());
    }

    @Test
    public void testLoadAll() {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente A");
        cliente1.setTelefone("11111111111");
        cliente1.setEmail("a@email.com");
        repositorio.create(cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cliente B");
        cliente2.setTelefone("22222222222");
        cliente2.setEmail("b@email.com");
        repositorio.create(cliente2);

        List<Cliente> clientes = repositorio.loadAll();

        assertEquals(2, clientes.size());
    }

    @Test
    public void testUpdate() {
        Cliente cliente = new Cliente();
        cliente.setNome("Nome Antigo");
        cliente.setTelefone("33333333333");
        cliente.setEmail("antigo@email.com");
        repositorio.create(cliente);

        cliente.setNome("Nome Novo");
        cliente.setTelefone("44444444444");
        cliente.setEmail("novo@email.com");
        repositorio.update(cliente);

        Cliente atualizado = repositorio.loadFromId(cliente.getId());

        assertNotNull(atualizado);
        assertEquals("Nome Novo", atualizado.getNome());
        assertEquals("44444444444", atualizado.getTelefone());
        assertEquals("novo@email.com", atualizado.getEmail());
    }

    @Test
    public void testDelete() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente para Deletar");
        cliente.setTelefone("55555555555");
        cliente.setEmail("deletar@email.com");
        repositorio.create(cliente);

        int id = cliente.getId();
        repositorio.delete(cliente);

        Cliente removido = repositorio.loadFromId(id);

        assertNull(removido);
        assertTrue(repositorio.loadAll().isEmpty());
    }
}
