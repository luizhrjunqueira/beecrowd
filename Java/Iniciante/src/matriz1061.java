import java.util.Scanner;
public class matriz1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // O split(" ") divide a String onde existe um espaço
        String diaInicio[] = sc.nextLine().split(" ");
        // Dividindo a Stringa então fica: diaInicio[0] = "Dia" & diaInicio[1] = "5", o valor armazenado em "1" foi chamado pela variável 'd1'

        // Neste exemplo: replaceAll(" ", "") remove TODOS os espaços, depois o split divide a String aonde exista ":"
        String horaInicio[] = sc.nextLine().replaceAll(" ", "").split(":");
        // Resultado: horaInicio[0] = "08", horaInicio[1] = "12" & horaInicio[2] = "23"

        String diaFinal[] = sc.nextLine().split(" ");
        String horaFinal[] = sc.nextLine().replaceAll(" ", "").split(":");

        // Valores armazenados pelo diaInicio e horaInicio
        int d1 = Integer.parseInt(diaInicio[1]);
        int h1 = Integer.parseInt(horaInicio[0]);
        int m1 = Integer.parseInt(horaInicio[1]);
        int s1 = Integer.parseInt(horaInicio[2]);

        // Valores armazenados pelo diaFinal e horaFinal
        int d2 = Integer.parseInt(diaFinal[1]); // Valor armazenado pelo diaFinal
        int h2 = Integer.parseInt(horaFinal[0]);
        int m2 = Integer.parseInt(horaFinal[1]);
        int s2 = Integer.parseInt(horaFinal[2]);

        // 1 minuto = 60 segundos, 1 hora = 3600 segundos, 1 dia = 24 horas = 86400 segundos
        // Desta forma multiplicamos "dias" 5 * 86400 "segundos"
        // +
        // Desta forma multiplicamos "horas" 8 * 3600 "segundos"
        // +
        // Desta forma multiplicamos "minutos" 12 * 60 "segundos"
        // +
        // Por fim, é somado os "segundos" restantes

        // O cálculo acima é usado exatamente da mesma maneira para calcular o horário inicial da festa e também o final
        int q1, q2, tempo;
        q1 = s1 + m1 * 60 + h1 * 3600 + d1 * 86400;
        q2 = s2 + m2 * 60 + h2 * 3600 + d2 * 86400;

        tempo = q2 - q1;

        // O resultado da subtração em segundos da horaInicio e horaFinal é dividia por 86400 segundos (DIAS)
        System.out.printf("%d dia(s)%n", (tempo / 86400));
        tempo = tempo % 86400;
        // O resto da divisão (DIAS) é usado novamente e dividido por 3600 (HORAS)
        System.out.printf("%d hora(s)%n", (tempo / 3600));
        tempo = tempo % 3600;
        // O resto da divisão (HORAS) é usado novamente e dividido por 60 (MINUTOS)
        System.out.printf("%d minuto(s)%n", (tempo / 60));
        // Por fim, o programa exibe o resto da divisão (MINUTOS) que são os segundos finais...
        tempo = tempo % 60;

        System.out.printf("%d segundo(s)%n", tempo);

        sc.close();
    }
}