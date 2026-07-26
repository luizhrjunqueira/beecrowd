import java.util.Locale;
import java.util.Scanner;

public class matriz1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N, resto, nota, moeda, quociente;
        N = sc.nextDouble();
        System.out.println("NOTAS:");

        // Armazena o valor inicial de N na variável resto
        resto = N;

        // Define o valor da cédula atual (R$ 100,00)
        nota = 100;
        // Calcula quantas notas de R$ 100 cabem no valor restante
        quociente = (int) (resto / nota);
        // Exibe a quantidade de notas de R$ 100
        System.out.printf("%.0f nota(s) de R$ %.2f%n", quociente, nota);
        // Atualiza o restante do valor após retirar as notas de R$ 100
        resto %= nota;

        nota = 50;
        quociente = (int) (resto / nota);
        System.out.printf("%.0f nota(s) de R$ %.2f%n", quociente, nota);
        resto %= nota;

        nota = 20;
        quociente = (int) (resto / nota);
        System.out.printf("%.0f nota(s) de R$ %.2f%n", quociente, nota);
        resto %= nota;

        nota = 10;
        quociente = (int) (resto / nota);
        System.out.printf("%.0f nota(s) de R$ %.2f%n", quociente, nota);
        resto %= nota;

        nota = 5;
        quociente = (int) (resto / nota);
        System.out.printf("%.0f nota(s) de R$ %.2f%n", quociente, nota);
        resto %= nota;

        nota = 2;
        quociente = (int) (resto / nota);
        System.out.printf("%.0f nota(s) de R$ %.2f%n", quociente, nota);
        resto %= nota;

        // Invertendo Para Moedas
        moeda = nota;
        System.out.println("MOEDAS:");

        moeda = 1;
        quociente = (int) (resto / moeda);
        System.out.printf("%.0f moeda(s) de R$ %.2f%n", quociente, moeda);
        resto %= moeda;

        moeda = 0.50;
        quociente = (int) (resto / moeda);
        System.out.printf("%.0f moeda(s) de R$ %.2f%n", quociente, moeda);
        resto %= moeda;

        moeda = 0.25;
        quociente = (int) (resto / moeda);
        System.out.printf("%.0f moeda(s) de R$ %.2f%n", quociente, moeda);
        resto %= moeda;

        moeda = 0.10;
        quociente = (int) (resto / moeda);
        System.out.printf("%.0f moeda(s) de R$ %.2f%n", quociente, moeda);
        resto %= moeda;

        moeda = 0.05;
        quociente = (int) (resto / moeda);
        System.out.printf("%.0f moeda(s) de R$ %.2f%n", quociente, moeda);
        resto %= moeda;

        moeda = 0.01;
        quociente = (resto / moeda);
        System.out.printf("%.0f moeda(s) de R$ %.2f%n", quociente, moeda);
        resto %= moeda;

        sc.close();
    }
}
