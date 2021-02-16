import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double P;

        while (true) {
            System.out.print("P (0 < P < 25): ");
            P = scanner.nextDouble();

            if (P > 0 && P < 25)
                break;
        }

        double S = 1000;

        int k = 0;

        while (S <= 1100) {
            S += (S * P / 100);
            k++;
        }

        System.out.println("Через " + k + " месяцев размер вклада будет: " + S);
    }
}