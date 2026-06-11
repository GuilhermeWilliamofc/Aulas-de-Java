public abstract class Veiculo
{
    String marca;
    String modelo;
    int ano;
    
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getAno(){
        return ano;
    }
    
    public abstract void acenderMotor();
}