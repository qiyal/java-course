import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1 - i) {
                    System.out.print("1" + " ");
                } else if (j < n - 1 - i) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print("2" + " ");
                }
            }
            System.out.println();
        }
    }
}
