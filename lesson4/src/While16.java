import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double P;

        while (true) {
            System.out.print("P (0 < P < 50): ");
            P = scanner.nextDouble();

            if (P > 0 && P < 50)
                break;
        }

        double S = 10;
        double sum = 10;

        int k = 0;

        while (sum <= 200) {
            S += (S * P / 100);
            sum += S;
            k++;
        }

        System.out.println("Через " + k + " дней сумма будет: " + sum);
    }
}