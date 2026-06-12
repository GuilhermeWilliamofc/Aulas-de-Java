package view;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Filme {
    private SimpleIntegerProperty id;
    private SimpleStringProperty titulo;
    private SimpleStringProperty genero;
    private SimpleIntegerProperty ano;
    
    public Filme(int id, String titulo, String genero, int ano) {
        this.id = new SimpleIntegerProperty(id);
        this.titulo = new SimpleStringProperty(titulo);
        this.genero = new SimpleStringProperty(genero);
        this.ano = new SimpleIntegerProperty(ano);
    }
    
    public int getId() {
        return this.id.get();
    }
    
    public void setId(int id) {
        this.id.set(id);
    }
    
    public String getTitulo() {
        return this.titulo.get();
    }
    
    public void setTitulo(String titulo) {
        this.titulo.set(titulo);
    }
    
    public String getGenero() {
        return this.genero.get();
    }
    
    public void setGenero(String genero) {
        this.genero.set(genero);
    }
    
    public int getAno() {
        return this.ano.get();
    }
    
    public void setAno(int ano) {
        this.ano.set(ano);
    }
}