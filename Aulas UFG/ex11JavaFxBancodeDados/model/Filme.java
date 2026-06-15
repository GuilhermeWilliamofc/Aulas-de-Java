package model;

import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName="filme")
public class Filme {
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField(dataType=DataType.STRING)
    private String titulo;
    
    @DatabaseField(dataType=DataType.STRING)
    private String genero;
    
    @DatabaseField(dataType=DataType.INTEGER)
    private int ano;
    
    //Start GetterSetterExtension Source Code
    /**GET Method Propertie id*/
    public int getId() {
        return this.id;
    }
    
    /**SET Method Propertie id*/
    public void setId(int id) {
        this.id = id;
    }
    
    /**GET Method Propertie titulo*/
    public String getTitulo() {
        return this.titulo;
    }
    
    /**SET Method Propertie titulo*/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**GET Method Propertie genero*/
    public String getGenero() {
        return this.genero;
    }
    
    /**SET Method Propertie genero*/
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    /**GET Method Propertie ano*/
    public int getAno() {
        return this.ano;
    }
    
    /**SET Method Propertie ano*/
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //End GetterSetterExtension Source Code
}
