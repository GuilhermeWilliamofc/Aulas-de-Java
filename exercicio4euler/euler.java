// classe da formula de euler 
// e^i*x = cos(x) + i*sen(x)

import java.util.Scanner;

public class euler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Forneca o valor de x: ");
        double x = scanner.nextDouble();

        String euler = Math.cos(x) + " + i*" + Math.sin(x);
        System.out.println("e^(i*" + x + ") = " + euler);

        scanner.close();
    }
}
