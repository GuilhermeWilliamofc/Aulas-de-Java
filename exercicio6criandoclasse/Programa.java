public class Programa
{
    public static void main(String[] args) {
        Computador pc1 = new Computador();
        pc1.processador = "Ryzen 5";
        pc1.ram = 0;
        pc1.placa_de_video = "gtx 1650";

        System.out.println("Pc 1 peças:");
        System.out.println("Processador: " + pc1.processador);
        System.out.println("RAM: " + pc1.ram);
        System.out.println("Placa de video: " + pc1.placa_de_video);
        pc1.ligar();
        System.out.print("O pc1 está ligado: ");
        System.out.println(pc1.ligado);
        System.out.println("\n");

        Computador pc2 = new Computador();
        pc2.processador = "Celeron";
        pc2.ram = 0;
        pc2.placa_de_video = "gtx 750";

        System.out.println("Pc 2 peças:");
        System.out.println("Processador: " + pc2.processador);
        System.out.println("RAM: " + pc2.ram);
        System.out.println("Placa de video: " + pc2.placa_de_video);
        pc2.ligar();
        System.out.print("O pc2 está ligado: ");
        System.out.println(pc2.ligado);
        System.out.print("\n");

        System.out.println("Alterando valores do pc1");
        pc1.upgrade();
        System.out.println("Alterando valores do pc2");
        pc2.upgrade();

        System.out.println("\nLigando pc1");
        pc1.ligar();
        System.out.println("\nLigando pc2");
        pc2.ligar();

        System.out.println("\nPc 1 peças:");
        System.out.println("Processador: " + pc1.processador);
        System.out.println("RAM: " + pc1.ram);
        System.out.println("Placa de video: " + pc1.placa_de_video);
        System.out.print("O pc1 está ligado: ");
        System.out.println(pc1.ligado);
        System.out.println("\n");

        System.out.println("Pc 2 peças:");
        System.out.println("Processador: " + pc2.processador);
        System.out.println("RAM: " + pc2.ram);
        System.out.println("Placa de video: " + pc2.placa_de_video);
        System.out.print("O pc2 está ligado: ");
        System.out.println(pc2.ligado);
    }
}