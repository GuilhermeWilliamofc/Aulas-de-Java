import java.util.Scanner;

public class Computador
{
    String processador;
    int ram;
    String placa_de_video;
    boolean ligado = false;

    void ligar()
    {
        if (this.processador != null && this.ram != 0 && this.placa_de_video != null){
            this.ligado = true;
            System.out.println("Computador ligado");
        }
        else{
            System.out.println("Erro ao ligar, falta peças");
        }
    }

    void upgrade(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ 1 ] - Processador");
        System.out.println("[ 2 ] - RAM");
        System.out.println("[ 3 ] - Placa de video");
        System.out.print("Qual peça vai ser alterada (Digite 0 para alterar nada): ");
        int peca = scanner.nextInt();
        scanner.nextLine();

        switch (peca){
            case 0:
                break;
            case 1:
                System.out.print("Digite o nome do novo processador: ");
                this.processador = scanner.nextLine();
                break;
            case 2:
                System.out.print("Digite o novo valor de RAM: ");
                this.ram = scanner.nextInt();
                break;
            case 3:
                System.out.print("Digite o nome da placa de video: ");
                this.placa_de_video = scanner.nextLine();
                break;
            default:
                System.out.print("Peça invalida");
                break;
        }
    }
}