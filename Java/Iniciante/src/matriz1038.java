import java.util.Locale;
import java.util.Scanner;

public class matriz1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco;
        int item = sc.nextInt();
        int quantidade = sc.nextInt();

        switch (item) {
            case 1:
                preco = 4.00;
                // O break encerra o switch e impede que ele continue executando os próximos cases
                break;

            case 2:
                preco = 4.50;
                break;

            case 3:
                preco = 5.00;
                break;

            case 4:
                preco = 2.00;
                break;

            case 5:
                preco = 1.50;
                break;
            // Default define um valor fixo, caso a variável não receba nenhum valor dentro das opções
            default:
                preco = 0.00;
        }

        double valor = preco * quantidade;
        System.out.printf("Total: R$ %.2f%n", valor);
        sc.close();
    }
}
