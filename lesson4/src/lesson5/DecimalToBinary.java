package lesson5;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";

        System.out.print("Decimal: ");
        int n = sc.nextInt();

        if (n != 0) {
            while (n > 0) {
                int q = n % 2;
                ans = q + ans;

                n = n / 2;
            }
        } else {
            ans = "0";
        }

        System.out.println("Binary: " + ans);
    }
}
