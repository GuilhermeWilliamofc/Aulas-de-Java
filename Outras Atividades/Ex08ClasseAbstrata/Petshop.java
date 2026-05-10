public class Petshop
{
    public static void animalSom(Animal a){
        a.emitirSom();
    }
    
    public static void main(String[] args){
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal passaro = new Passaro();
        
        System.out.println("Animais emitindo sons:");
        
        // Polimorfismo
        System.out.println("Cachorro:");
        animalSom(cachorro);
        System.out.println("\nGato:");
        animalSom(gato);
        System.out.println("\nPassaro:");
        animalSom(passaro);
    }
}