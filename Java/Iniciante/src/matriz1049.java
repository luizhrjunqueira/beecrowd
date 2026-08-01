import java.util.Scanner;

public class matriz1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipo1 = sc.nextLine();
        String tipo2 = sc.nextLine();
        String tipo3 = sc.nextLine();

        if (tipo1.equalsIgnoreCase("vertebrado")) {
            if (tipo2.equalsIgnoreCase("ave")) {
                if (tipo3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (tipo3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (tipo2.equalsIgnoreCase("inseto")) {
                if (tipo3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (tipo3.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                } else {
                    System.out.println("sanguessuga");
                }
            }
        }

        sc.close();
    }
}
