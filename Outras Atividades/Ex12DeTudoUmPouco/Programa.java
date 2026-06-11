public class Programa
{
    public static void acender(Veiculo v){
        v.acenderMotor();
    }
    
    public static double taxad(TransportePago tp){
        return tp.calcularTaxa();
    }
    
    public static void main(String[] args){
        Veiculo carro = new Carro("Toyota", "Corolla", 2023);
        Veiculo moto = new Moto("Honda", "CBR600", 2021);
        
        // Ligando os Veiculos
        acender(carro);
        acender(moto);
        
        // Casting (Mudar o tipo da variável) para poder usar o taxad :D
        double taxaCarro = taxad((TransportePago) carro);
        double taxaMoto = taxad((TransportePago) moto);
        
        // Mostrar os Dados de Taxa
        System.out.printf("Taxa do Carro (%s da %s de %d):\nR$ %.2f\n", carro.modelo, carro.marca, carro.ano, taxaCarro);
        System.out.printf("Taxa da Moto (%s da %s de %d):\nR$ %.2f\n", moto.modelo, moto.marca, moto.ano, taxaMoto);
    }
}