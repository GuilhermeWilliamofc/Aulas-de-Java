public class Moto extends Veiculo implements TransportePago
{
    private double valorTaxa = 40.0;
    
    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }
    
    @Override
    public void acenderMotor(){
        System.out.println("Motor da Moto ligado!");
    }
    
    @Override
    public double calcularTaxa(){
        return valorTaxa;
    }
}