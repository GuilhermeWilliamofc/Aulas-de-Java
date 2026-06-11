public class Carro extends Veiculo implements TransportePago
{
    private double valorTaxa = 80.0;
    
    public Carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }
    
    @Override
    public void acenderMotor(){
        System.out.println("Motor do Carro ligado!");
    }
    
    @Override
    public double calcularTaxa(){
        return valorTaxa;
    }
}