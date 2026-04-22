import java.util.Scanner;

public class Programa
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.printf("Digite a idade de %s: \n", nome);
        int idade = scanner.nextInt();
        
        System.out.printf("Digite a media de %s: \n", nome);
        double media = scanner.nextDouble();
        
        System.out.printf("Digite a situacao (aprovado/reprovado) de %s: \n", nome);
        String situacao = scanner.next();
        
        Estudante estudante = new Estudante(nome, idade, media, situacao);
        estudante.printDados();
    }
}