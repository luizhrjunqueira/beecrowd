import java.util.Locale;
import java.util.Scanner;

public class matriz1044 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B && A % B == 0){
            System.out.println("Sao Multiplos");
        } else if (B > A && B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
