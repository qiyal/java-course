import java.util.Random;
import java.util.Scanner;

public class CinemaV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("m: ");
        int m = sc.nextInt();

        int [][] places = new int[n][m];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                places[i][j] = r.nextInt(2);
            }
        }

        String colStr = "";
        for(int i = 1; i <= m; i++) {
            colStr += i + " ";
        }

        System.out.println("  " + colStr);
        for(int i = 0; i < n; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < m; j++) {
                System.out.print(places[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("row: ");
        int row = sc.nextInt();
        System.out.print("col: ");
        int col = sc.nextInt();

        if (row > n || row < 1) {
            System.out.println("Row must be 1 <= " + n);
        } else if (col > n || col < 1) {
            System.out.println("Col must be 1 <= " + m);
        } else {
            if (n / 2 >= row) {
                System.out.println("Price of ticket: 1000");
            } else {
                System.out.println("Price of ticket: 700");
            }
        }
    }
}
