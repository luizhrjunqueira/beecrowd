import java.util.Locale;
import java.util.Scanner;

public class matriz1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, reajusteSalarial, novoSalario;
        salario = sc.nextDouble();

        if (salario <= 400.00) {
            novoSalario = salario * 0.15 + salario;
            reajusteSalarial = novoSalario - salario;
            double percentual = 0.15 * 100;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteSalarial);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        } else if (salario <= 800.00) {
            novoSalario = salario * 0.12 + salario;
            reajusteSalarial = novoSalario - salario;
            double percentual = 0.12 * 100;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteSalarial);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        } else if (salario <= 1200.00) {
            novoSalario = salario * 0.10 + salario;
            reajusteSalarial = novoSalario - salario;
            double percentual = 0.10 * 100;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteSalarial);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        } else if (salario <= 2000.00) {
            novoSalario = salario * 0.07 + salario;
            reajusteSalarial = novoSalario - salario;
            double percentual = 0.07 * 100;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteSalarial);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        } else if (salario > 2000.00) {
            novoSalario = salario * 0.04 + salario;
            reajusteSalarial = novoSalario - salario;
            double percentual = 0.04 * 100;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteSalarial);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        }

        sc.close();
    }
}
