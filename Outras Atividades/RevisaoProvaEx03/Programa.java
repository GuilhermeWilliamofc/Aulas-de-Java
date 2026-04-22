import java.util.Scanner;

public class Programa
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Voce quer somar de 1 ate quanto?\nDigite: ");
        int valorDigitado = scanner.nextInt();
        Soma soma = new Soma(valorDigitado);
        soma.calcularSoma();
    }
}