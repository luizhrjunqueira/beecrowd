import java.util.Locale;
import java.util.Scanner;

public class matriz1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X, resultado;

        X = sc.nextInt();

        resultado = 2 * X;

        System.out.println(resultado + " minutos");
        sc.close();
    }
}