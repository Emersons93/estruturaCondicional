import java.util.Locale;
import java.util.Scanner;

public class mediaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL: = %.1f%n", notaFinal);

        if (notaFinal < 60.0) {
            System.out.println("NÃO PASSOU JUMENTO");
        } else if (notaFinal > 60.0) {
            System.out.println("DEU SORTE PASSOU RASPANDO");
        }

        sc.close();
    }
}
