import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "produto")  // Nome da tabela no banco
public class Produto {

    @DatabaseField(generatedId = true)  // ID auto-incremento
    private int id;

    @DatabaseField  // Campo mapeado automaticamente
    private String nomeProduto;

    @DatabaseField
    private double precoProduto;

    // Construtor padrão (obrigatório para ORMLite)
    public Produto() {}

    // Construtor auxiliar
    public Produto(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomeProduto() { return nomeProduto; }
    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }

    public double getPrecoProduto() { return precoProduto; }
    public void setPrecoProduto(double precoProduto) { this.precoProduto = precoProduto; }

    @Override
    public String toString() {
        return String.format("Produto{id: %d, Nome do Produto: '%s', Preco do Produto: %.2f}", id, nomeProduto, precoProduto);
    }
}