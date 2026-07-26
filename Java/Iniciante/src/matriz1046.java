import java.util.Locale;
import java.util.Scanner;

public class matriz1046 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();

        if (horaInicio == horaFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (horaInicio < horaFinal) {
            int tempoTotal = horaFinal - horaInicio;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", tempoTotal);
        } else {
            int tempoTotal = (24 - horaInicio) + horaFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", tempoTotal);
        }
        sc.close();
    }
}