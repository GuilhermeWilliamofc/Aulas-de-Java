public class Main
{
    public static void calcular(Forma f){
        double calculo = f.calcularArea();
        System.out.printf("A Área do %s eh: %.2f\n", f.descrever(), calculo);
    }
    
    public static void mostrarDados(Forma f){
        System.out.printf("O Tipo eh: %s\n", f.descrever());
        calcular(f);
    }
    
    public static void main(){
        Forma circulo = new Circulo(4);
        Forma retangulo = new Retangulo(3,6);
        
        mostrarDados(circulo);
        mostrarDados(retangulo);
    }
}