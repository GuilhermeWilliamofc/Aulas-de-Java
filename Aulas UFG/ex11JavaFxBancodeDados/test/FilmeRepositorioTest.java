package test;

import model.Database;
import model.Filme;
import model.FilmeRepositorio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

public class FilmeRepositorioTest {

    private Database database;
    private FilmeRepositorio repositorio;
    private String databaseName;

    @Before
    public void setUp() {
        databaseName = "test_filme_" + System.nanoTime() + ".sqlite";
        database = new Database(databaseName);
        repositorio = new FilmeRepositorio(database);
    }

    @After
    public void tearDown() {
        database.close();
        new File(databaseName).delete();
    }

    @Test
    public void testCreate() {
        Filme filme = new Filme();
        filme.setTitulo("Matrix");
        filme.setGenero("Ficção");
        filme.setAno(1999);

        Filme salvo = repositorio.create(filme);

        assertNotNull(salvo);
        assertTrue(salvo.getId() > 0);
        assertEquals("Matrix", salvo.getTitulo());
        assertEquals("Ficção", salvo.getGenero());
        assertEquals(1999, salvo.getAno());
    }

    @Test
    public void testLoadFromId() {
        Filme filme = new Filme();
        filme.setTitulo("Inception");
        filme.setGenero("Ficção");
        filme.setAno(2010);
        repositorio.create(filme);

        Filme carregado = repositorio.loadFromId(filme.getId());

        assertNotNull(carregado);
        assertEquals(filme.getId(), carregado.getId());
        assertEquals("Inception", carregado.getTitulo());
        assertEquals("Ficção", carregado.getGenero());
        assertEquals(2010, carregado.getAno());
    }

    @Test
    public void testLoadAll() {
        Filme filme1 = new Filme();
        filme1.setTitulo("Filme A");
        filme1.setGenero("Drama");
        filme1.setAno(2000);
        repositorio.create(filme1);

        Filme filme2 = new Filme();
        filme2.setTitulo("Filme B");
        filme2.setGenero("Comédia");
        filme2.setAno(2010);
        repositorio.create(filme2);

        List<Filme> filmes = repositorio.loadAll();

        assertEquals(2, filmes.size());
    }

    @Test
    public void testUpdate() {
        Filme filme = new Filme();
        filme.setTitulo("Título Antigo");
        filme.setGenero("Ação");
        filme.setAno(2005);
        repositorio.create(filme);

        filme.setTitulo("Título Novo");
        filme.setGenero("Drama");
        filme.setAno(2006);
        repositorio.update(filme);

        Filme atualizado = repositorio.loadFromId(filme.getId());

        assertNotNull(atualizado);
        assertEquals("Título Novo", atualizado.getTitulo());
        assertEquals("Drama", atualizado.getGenero());
        assertEquals(2006, atualizado.getAno());
    }

    @Test
    public void testDelete() {
        Filme filme = new Filme();
        filme.setTitulo("Filme para Deletar");
        filme.setGenero("Terror");
        filme.setAno(2015);
        repositorio.create(filme);

        int id = filme.getId();
        repositorio.delete(filme);

        Filme removido = repositorio.loadFromId(id);

        assertNull(removido);
        assertTrue(repositorio.loadAll().isEmpty());
    }
}
