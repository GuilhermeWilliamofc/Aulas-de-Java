
/**
 * Escreva uma descrição da classe esfera aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

// Volume da Esfera: V = 4/3 * pi * r^3

import java.util.Scanner;

public class esfera{   
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        double volume;
        System.out.print("Forneca o raio: ");
        double raio = scanner.nextDouble();
        
        volume = (4.0/3.0) * Math.PI * (raio * raio * raio);
        System.out.println(volume);
        
        scanner.close();
    }
}
