
/**
 * Escreva uma descrição da classe esfera aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

// encaminhar atividade por email com a matricula, a formula utilizada em latex
// Volume da Esfera: V = 4/3 * pi * r^3
// marceloakira@ufg.br

import java.util.Scanner;

public class esfera{   
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        double volume;
        System.out.print("Forneça o raio:");
        double raio = scanner.nextDouble();
        
        volume = (4.0/3.0) * Math.PI * (raio * raio * raio);
        System.out.println(volume);
        
        scanner.close();
    }
}
