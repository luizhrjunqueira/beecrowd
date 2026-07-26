import java.util.Locale;
import java.util.Scanner;

public class matriz1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number, horas;

        number = sc.nextInt();
        horas = sc.nextInt();

        double valorHora = sc.nextDouble();

        valorHora = valorHora * horas;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", valorHora);

        sc.close();
    }
}