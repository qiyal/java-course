import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        int [][] arr;

        int t = sc.nextInt();

        for (int q = 0; q < t; q++) {
            n = sc.nextInt();
            m = sc.nextInt();
            arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            String ans = "YES";
            boolean stop = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int sum = 1;

                    if (j + 1 < m) {
                        if (arr[i][j] == arr[i][j + 1]) {
                            sum++;
                        }
                    }

                    if (i + 1 < n) {
                        if (arr[i][j] == arr[i + 1][j]) {
                            sum++;
                        }
                    }

                    if (i + 1 < n && j + 1 < m) {
                        if (arr[i][j] == arr[i + 1][j + 1]) {
                            sum++;
                        }
                    }

                    if (sum == 4) {
                        ans = "NO";
                        stop = true;
                        break;
                    }
                }

                if (stop == true) {
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}
