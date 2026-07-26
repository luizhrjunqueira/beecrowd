import java.util.Locale;
import java.util.Scanner;

public class matriz1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horas, velocidade;
        double kmLitro, litros;

        kmLitro = 12;

        horas = sc.nextInt();
        velocidade = sc.nextInt();

        litros = (horas * velocidade / kmLitro);

        System.out.printf("%.3f%n", litros);
        sc.close();
    }
}