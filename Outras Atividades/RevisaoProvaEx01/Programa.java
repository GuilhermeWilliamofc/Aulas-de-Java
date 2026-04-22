import java.util.Scanner;

public class Programa{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a Unidade de Temperatura:\n0 - Celsius\n1 - Fahrenheit\nDigite: ");
        int unidadeTemp = scanner.nextInt();
        
        scanner.nextLine(); // "Limpa" o buffer consumindo o '\n' que sobrou
        
        System.out.println("Qual a Temperatura: ");
        double temperatura = scanner.nextDouble();
        
        ConversorTemperatura conversor = new ConversorTemperatura(temperatura, unidadeTemp);
        double resultado = conversor.converter();
        
        System.out.println(resultado);
    }
}