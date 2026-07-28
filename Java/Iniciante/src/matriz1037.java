import java.util.Locale;
import java.util.Scanner;

public class matriz1037 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        if (N >= 0 && N <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else if (N >= 25.00001 && N <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        } else if (N >= 50.00000001 && N <= 75.0000000) {
            System.out.println("Intervalo (50,75]");
        } else if (N >= 75.00000001 && N <= 100.0000000) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}