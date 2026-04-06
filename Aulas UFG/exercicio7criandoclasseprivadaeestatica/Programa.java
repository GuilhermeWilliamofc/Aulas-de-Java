/*
- Criar outra classe Programa que teste todos os 
construtores e atributos da classe criada;      
*/

import java.util.Scanner;

public class Programa
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando Conta1
        System.out.println("Conta1:");
        System.out.println("Construindo uma conta com os valores padrões do java...");
        ContaInstagram conta1 = new ContaInstagram();
        System.out.println("");
        // Criando Conta2
        System.out.println("Conta2:");
        System.out.print("Digite o nome de usuario: ");
        String nome_de_usuario = scanner.nextLine();
        ContaInstagram conta2 = new ContaInstagram(nome_de_usuario);
        System.out.println("Construindo uma conta com o nome de usuario inserido e os demais valores como padrão...");
        System.out.println("");
        // Criando Conta3
        System.out.println("Conta3:");
        System.out.print("Digite o nome de usuario: ");
        String nome_de_usuario2 = scanner.nextLine();
        System.out.print("Digite o email de usuario: ");
        String email_do_usuario2 = scanner.nextLine();
        ContaInstagram conta3 = new ContaInstagram(nome_de_usuario2, email_do_usuario2);
        System.out.println("Construindo uma conta com o nome e email de usuario inseridos...");
        System.out.println("");
        
        // Printando dados das Contas
        System.out.println("Printando dados da Conta1...");
        System.out.println("Nome de Usuario: " + conta1.getNomeDeUsuario());
        System.out.println("Email do Usuario: " + conta1.getEmailDoUsuario());
        System.out.println("Numero de Seguidores: " + conta1.getNumeroDeSeguidores());
        System.out.println("Total de Contas Criadas: " + conta1.gettotalDeContasCriadas());
        
        System.out.println("");
        
        System.out.println("Printando dados da Conta2...");
        System.out.println("Nome de Usuario: " + conta2.getNomeDeUsuario());
        System.out.println("Email do Usuario: " + conta2.getEmailDoUsuario());
        System.out.println("Numero de Seguidores: " + conta2.getNumeroDeSeguidores());
        System.out.println("Total de Contas Criadas: " + conta2.gettotalDeContasCriadas());
        
        System.out.println("");
        
        System.out.println("Printando dados da Conta3...");
        System.out.println("Nome de Usuario: " + conta3.getNomeDeUsuario());
        System.out.println("Email do Usuario: " + conta3.getEmailDoUsuario());
        System.out.println("Numero de Seguidores: " + conta3.getNumeroDeSeguidores());
        System.out.println("Total de Contas Criadas: " + conta3.gettotalDeContasCriadas());
    }
}
