package leetcode;

import java.util.Scanner;

public class Halk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String ans = "";
        String odd = "I hate ";
        String even = "I love ";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                ans += odd;
            } else {
                ans += even;
            }

            if (i != n) {
                ans += "that ";
            }
        }

        ans += "it";

        System.out.println(ans);
    }
}
