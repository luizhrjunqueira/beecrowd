import java.util.Locale;
import java.util.Scanner;

public class matriz1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maior = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maior + " eh o maior");

        sc.close();
    }
}