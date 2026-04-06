// uma formula util para minha area talvez seria a distancia entre dois pontos
// distancia = raiz((x2 - x1)^2 + (y2 - y1)^2)

import java.util.Scanner;

public class distancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distancia;
        System.out.print("Forneca o valor de x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Forneca o valor de y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Forneca o valor de x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Forneca o valor de y2: ");
        double y2 = scanner.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distancia entre os pontos eh: " + distancia);
        scanner.close();
    }
}
