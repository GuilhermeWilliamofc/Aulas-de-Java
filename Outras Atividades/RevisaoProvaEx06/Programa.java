import java.util.Scanner;

public class Programa
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Usuario");
        String nome;
        String email;
        String dataNasc;
        int continuar;
        while (true){
            System.out.print("Digite o Nome: \n");
            nome = scanner.nextLine();
            
            System.out.printf("Digite o email de %s: \n", nome);
            email = scanner.next();
            
            System.out.printf("Digite a Data de Nascimento de %s: \n", nome);
            dataNasc = scanner.next();
            
            Usuario usuario = new Usuario(nome, email, dataNasc);
            usuario.printDados();
            
            do{
                System.out.println("\nDeseja Continuar?");
                System.out.println("[ 1 ] - Sim");
                System.out.println("[ 2 ] - Nao");
                System.out.print("Digite: ");
                continuar = scanner.nextInt();
                
                if (continuar != 1 && continuar != 2){
                    System.out.print("Erro! Digite 1 ou 2!");
                }
            } while (continuar != 1 && continuar != 2);
            
            if (continuar == 2){
                break;
            }
            
            scanner.nextLine();
        }
        System.out.println("Programa Encerrado!");
    }
}