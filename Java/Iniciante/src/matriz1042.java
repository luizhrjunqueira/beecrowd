import java.util.Scanner;

public class matriz1042 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int min, min2 = 0, min3 = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        min = Math.min(A, Math.min(B, C));

        if (min == A) {
            min2 = Math.min(B, C);
            min3 = Math.max(B, C);
        }
        if (min == B) {
            min2 = Math.min(A, C);
            min3 = Math.max(A, C);
        }
        if (min == C) {
            min2 = Math.min(A, B);
            min3 = Math.max(A, B);
        }

        System.out.println(min);
        System.out.println(min2);
        System.out.println(min3);
        System.out.println("");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        sc.close();
    }
}
