
public class Tecnico extends FuncionarioDoTime
{
    private int anos_restante_contrato;
    private int numero_de_vitorias;
    
    public int getAnos_restante_contrato(){
        return anos_restante_contrato;
    }
    
    public void setAnos_restante_contrato(int novoAnos_restante_contrato){
        this.anos_restante_contrato = novoAnos_restante_contrato;
    }
    
    public int getnumero_de_vitorias(){
        return numero_de_vitorias;
    }
    
    public void setNumero_de_vitorias(int novoNumero_de_vitorias){
        this.numero_de_vitorias = novoNumero_de_vitorias;
    }
    
    @Override
    public void treinarTime(){
        System.out.println("Iniciando Treino com os Jogadores...");
    }
    
    @Override 
    protected void tituloDados(){
        System.out.println("===== Dados do Técnico =====");
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados(); // reaproveita o que já existe
        System.out.println("Anos restantes de contrato: " + getAnos_restante_contrato());
        System.out.println("Número de vitórias: " + getnumero_de_vitorias());
    }
}
