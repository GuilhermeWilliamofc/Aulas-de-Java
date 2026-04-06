// classe de volume do cilindro com uma função de potenciação ou logaritmica, vou escolher de potenciação
// volume = pi * raio^2 * altura

import java.util.Scanner;

public class cilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double volume;
        System.out.print("Forneca o raio: ");
        double raio = scanner.nextDouble();

        System.out.print("Forneca a altura: ");
        double altura = scanner.nextDouble();

        volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume do cilindro eh: " + volume);
        scanner.close();
    }
}
