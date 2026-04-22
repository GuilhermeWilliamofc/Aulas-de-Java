import java.util.Scanner;

public class Programa
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Voce quer contar de 1 até quanto?\nDigite: ");
        int limiteDigitado = scanner.nextInt();
        
        Contagem contagem = new Contagem(limiteDigitado);
        contagem.contar();
    }
}