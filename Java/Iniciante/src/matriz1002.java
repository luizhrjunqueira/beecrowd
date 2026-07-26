import java.util.Locale;
import java.util.Scanner;

public class matriz1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double area, raio, n, X;
        n = 3.14159;

        X = sc.nextDouble();
        raio = Math.pow(X, 2);

        area = n * raio;

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}