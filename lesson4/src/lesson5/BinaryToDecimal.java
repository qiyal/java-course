package lesson5;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Binary: ");
        String binary = sc.next();

        int maxPow = binary.length() - 1;
        int answer = 0;
        for (int i = 0; i < binary.length(); i++) {
            int x = binary.charAt(i) - '0';

            answer += x * (int) Math.pow(2, maxPow - i);
            // answer = answer + (int) Math.pow(2, maxPow - i)
        }

        System.out.println("Decimal: " + answer);
    }
}
