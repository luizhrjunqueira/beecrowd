import java.util.Locale;
import java.util.Scanner;

public class matriz1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X;
        double Y, valor;

        X = sc.nextInt();
        Y = sc.nextDouble();

        valor = X / Y;

        System.out.printf("%.3f km/l%n", valor);

        sc.close();
    }
}