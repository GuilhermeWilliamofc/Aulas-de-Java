public class Circulo implements Forma
{
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        double calculo = 3.14 * (raio * raio);
        return calculo;
    }
    
    @Override
    public String descrever(){
        return "Circulo";
    }
}