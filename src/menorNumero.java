import java.util.Locale;
import java.util.Scanner;

public class menorNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("MENOR = " + n1);
        } else if (n2 < n3) {
            System.out.println("MENOR = " + n2);
        } else {
            System.out.println("MENOR = " + n3);
        }
        sc.close();

    }
}
