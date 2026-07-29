import java.util.Locale;
import java.util.Scanner;

public class matriz1041 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {

            System.out.println("Origem");

        } else if (x != 0.0 && y == 0.0) {

            System.out.println("Eixo X");
            
        } else if (x == 0.0 && y != 0.0) {

            System.out.println("Eixo Y");

        } else if (x > 0.0 && y > 0.0) {
            // Quadrante 1 - Ambos positivos
            System.out.println("Q1");
            
        } else if (x < 0.0 && y > 0.0) {
            // Quadrante 2 - X negativo, Y positivo
            System.out.println("Q2");
            
        } else if (x < 0.0 && y < 0.0) {
            // Quadrante 3 - Ambos negativos
            System.out.println("Q3");

        } else {
            // Quadrante 4 - X positivo, Y negativo
            System.out.println("Q4");

        }

        sc.close();
    }
}
