import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][] chArr = new char[n][m];

        for (int i = 0; i < n; i++){
            String s = sc.next();
            chArr[i] = s.toCharArray();
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chArr[i][j] == '.') {
                    boolean ans = true;

                    if (i > 0 && chArr[i - 1][j] != '.') {
                        ans = false; 
                    }

                    if (i != n - 1 && chArr[i + 1][j] != '.') {
                        ans = false;
                    }

                    if (j > 0 && chArr[i][j - 1] != '.') {
                        ans = false;
                    }

                    if (j != m - 1 && chArr[i][j + 1] != '.') {
                        ans = false;
                    }

                    if (ans == true) {
                        k++;
                    }
                }
            }
        }

        System.out.println(k);

    }
}
