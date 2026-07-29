import java.util.Locale;
import java.util.Scanner;

public class matriz1045 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();

        double A, B, C;
        if (N1 > N2 && N1 > N3) {

            A = N1;
            if (N2 > N3) {
                B = N2;
                C = N3;
            } else {
                B = N3;
                C = N2;
            }

        } else if (N2 > N3) {

            A = N2;
            if (N1 > N3) {
                B = N1;
                C = N3;
            } else {
                B = N3;
                C = N1;
            }

        } else {

            A = N3;
            if (N1 > N2) {
                B = N1;
                C = N2;
            } else {
                B = N2;
                C = N1;
            }
        }


        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (A * A == B * B + C * C) {
            // Três possibilidades de ângulo
            System.out.println("TRIANGULO RETANGULO");
        } else if (A * A > B * B + C * C) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        // Verifica se é equilatero ou isosceles
        if (A == B && B == C){
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || A == C || B == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        sc.close();
    }
}



