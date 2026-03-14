
/**
 * Escreva uma descrição da classe arredondamento aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
// classe de area do circulo com uma função de arredondamento
// area = pi * (raio * raio)
import java.util.Scanner;

public class Areacirculo
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        double area;
        System.out.print("Forneca o raio: ");
        double raio = scanner.nextDouble();
        
        area = Math.PI * (raio * raio);
        area = Math.round(area);
        
        System.out.println(area + " (Valor Aproximado)");
        scanner.close();
    }
}